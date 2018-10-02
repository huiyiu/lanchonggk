package com.lanchong;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lanchong.forum.entity.AttachmentN;
import com.lanchong.forum.mapper.AttachmentMapper;
import com.lanchong.util.DateUtils;
import org.apache.commons.codec.digest.DigestUtils;
import org.jasypt.encryption.StringEncryptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = GKApplication.class)
public class test_jiami {
    @Autowired
    StringEncryptor stringEncryptor;
    @Autowired
    AttachmentMapper attachmentMapper;

    @Test
    public void encryptPwd() {
        String result = stringEncryptor.encrypt("");
        System.out.println(result);
        stringEncryptor.decrypt("");
    }

    @Test
    public void testMd5(){
        System.out.println(DigestUtils.md5Hex("123456"));
        System.out.println(DigestUtils.md5Hex("a111111")+"e18e02");
        System.out.println(DigestUtils.md5Hex(DigestUtils.md5Hex("a111111")+"e18e02"));
        System.out.println(DigestUtils.md5Hex(DigestUtils.md5Hex("a111111")+".e18e02"));
    }

    @Test
    public void insertN(){
        AttachmentN attachmentN = new AttachmentN();
        attachmentN.setAid(99);
        attachmentN.setAttachment("222");
        attachmentN.setDescription("");
        attachmentN.setDateline(DateUtils.now());
        attachmentN.setFilename("333");
        attachmentN.setFilesize(445);
        attachmentN.setIsimage(1);
        attachmentN.setPrice((short)1);
        attachmentN.setPid(1);
        attachmentN.setUid(2);
        attachmentN.setTid(6);
        attachmentN.setReadperm(30);
        attachmentMapper.insertN((byte)8, attachmentN);
    }

    @Test
    public void testRRRRR(){
        //DateUtils.
    }

    @Test
    public void test(){
        String fromString = "{\n" +
                "\t\"property0\": {\n" +
                "\t\t\"property0_1\": \"50\",\n" +
                "\t\t\"property0_2\": \"170\"\n" +
                "\t},\n" +
                "\t\"property1\":\"100\"\n" +
                "}";
        String ruleString = "{\"property0\":{\n" +
                "\t\t\"property0_1\":{\n" +
                "\t\t\t\"prostyle\":\">=\"\n" +
                "\t\t},\n" +
                "\t\t\"property0_2\":{\n" +
                "\t\t\t\"prostyle\":\">=\"\n" +
                "\t\t}\n" +
                "\t},\n" +
                "\"property1\":{\n" +
                "\t\t\"prostyle\":\"+\",\n" +
                "\t\t\"t_property1key\":\"property1\",\n" +
                "\t\t\"t_property2key\":\"property0.property0_1\"\n" +
                "}\n" +
                "}";
        String toString = "{\n" +
                "\t\"property0\": {\n" +
                "\t\t\"property0_1\": \"45\",\n" +
                "\t\t\"property0_2\": \"165\"\n" +
                "\t},\n" +
                "\t\"property1\":\"100\"\n" +
                "}";
        isJson(toString);
        isJson(ruleString);
        isJson(fromString);
        Map<String,Object> fromMaps=  string2Map(fromString);
        Map<String,Object> rules =string2Map(ruleString);
        Map<String,Object> toMaps=string2Map(toString);

        System.out.println();

        genExpressions2(fromMaps,rules,toMaps);

    }

    public static boolean isJson(String content) {
        String regEx_space = "\\s*|\t|\r|\n";//
        Pattern p_space = Pattern.compile(regEx_space, Pattern.CASE_INSENSITIVE);
        Matcher m_space = p_space.matcher(content);
        content = m_space.replaceAll(""); //
        try {
            final ObjectMapper mapper = new ObjectMapper();
            mapper.readTree(content);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static Map<String,Object> string2Map(String property){
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true);
            return mapper.readValue(property, new TypeReference<Map<String, Object>>(){});
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new HashMap<>();
    }


    public String genExpressions2(Map<String,Object> fromMaps,Map<String,Object> rules,Map<String,Object> toMaps){

        //Map<String,Object> rules = ruleEntity.getProperty();
        //Map<String,Object> toMaps = toEntity.getProperty();
        //Map<String,Object> fromMaps = dataEntity.getProperty();
        List<String> ruleList = new ArrayList<>();

        for(Map.Entry<String,Object> outerRuleMap : rules.entrySet()){
            Map<String,Object> outerM = ((Map<String,Object>)outerRuleMap.getValue());
            String outerK = outerRuleMap.getKey();
            //single
            if(outerM.containsKey("prostyle")){
                String prostyle = (String)((Map<String,Object>)outerRuleMap.getValue()).get("prostyle");
                String fromV = "0";
                if(fromMaps.containsKey(outerK)){
                    fromV = (String)fromMaps.get(outerK);
                }
                String toV = "";
                if("+".equals(prostyle)){
                    toV = getSpecialVal(outerM,toMaps,prostyle);
                    ruleList.add(fromV+"=="+toV);
                }else{
                    toV =  (String)toMaps.get(outerK);
                    ruleList.add(fromV + prostyle + toV);
                }
            }else{//double
                for(Map.Entry<String,Object> mediumMap : outerM.entrySet()){
                    Map<String,Object> innerM = ((Map<String,Object>)mediumMap.getValue());
                    String innerK = mediumMap.getKey();
                    String prostyle = (String)innerM.get("prostyle");
                    String fromV = "0";
                    if(fromMaps.containsKey(outerK) && ((Map<String,Object>)fromMaps.get(outerK)).containsKey(innerK)){
                        fromV = (String)((Map<String,Object>)fromMaps.get(outerK)).get(innerK);
                    }
                    String toV = "";
                    if("+".equals(prostyle)){
                        toV = getSpecialVal(innerM,toMaps,prostyle);
                        ruleList.add(fromV+"=="+toV);
                    }else{
                        toV =  (String)((Map<String,Object>)toMaps.get(outerK)).get(innerK);
                        ruleList.add(fromV+prostyle+toV);
                    }
                }
            }
        }
        return ruleList.stream().collect(Collectors.joining("&&"));
    }


    private boolean spiltByFull(String str){
        return str.split("\\.").length == 2;
    }

    private String getSpecialVal(Map<String,Object> ruleMap,Map<String,Object> toMaps,String prostyle){
        String t_property1key = (String)(ruleMap).get("t_property1key");
        String t_property2key = (String)(ruleMap).get("t_property2key");
        String property1val = "";
        String property2val = "";
        if(spiltByFull(t_property1key)){
            String[] property1key = t_property1key.split("\\.");
            property1val = (String)(( Map<String,Object>)toMaps.get(property1key[0])).get(property1key[1]);
        }else{
            property1val = (String)(toMaps.get(t_property1key));
        }
        if(spiltByFull(t_property2key)){
            String[] property2key = t_property2key.split("\\.");
            property2val = (String)(( Map<String,Object>)toMaps.get(property2key[0])).get(property2key[1]);
        }else{
            property2val = (String)(toMaps.get(t_property2key));
        }
        if("0".equals(property2val) && "/".equals(prostyle)){
            //todo errorcode
        }
        return (null == property1val ? "0" : property1val)+ prostyle + (null == property2val ? 0 : property2val) ;
    }
}





package com.lanchong;

import com.lanchong.forum.entity.AttachmentN;
import com.lanchong.forum.mapper.AttachmentMapper;
import com.lanchong.util.DateUtils;
import org.apache.commons.codec.digest.DigestUtils;
import org.jasypt.encryption.StringEncryptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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
}





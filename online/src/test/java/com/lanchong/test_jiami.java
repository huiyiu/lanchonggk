package com.lanchong;

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
}





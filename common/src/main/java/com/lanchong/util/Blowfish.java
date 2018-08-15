package com.lanchong.util;

import lombok.extern.slf4j.Slf4j;

import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
 
@Slf4j
public class Blowfish {

 public static Key keyGenerator() {

     KeyGenerator keyGenerator = null;
     try {
         keyGenerator = KeyGenerator.getInstance("Blowfish");
     } catch (NoSuchAlgorithmException e) {
         log.error("初始化Blowfish算法失败！");
     }

     keyGenerator.init(128);

     return keyGenerator.generateKey();

 }



 /**

  * 加密

  *

  * @param key

  * @param text

  * @return

  * @throws Exception

  */

 public static byte[] encrypt(Key key,String text) throws Exception  {

      Cipher cipher = Cipher.getInstance("Blowfish/ECB/PKCS5Padding");

      cipher.init(Cipher.ENCRYPT_MODE, key);

      return cipher.doFinal(text.getBytes());

 }

   

 /**

  * 解密

  *

  * @param key

  * @param bt

  * @return

  * @throws Exception

  */

 public static byte[] decrypt(Key key,byte[] bt) throws Exception  {

     Cipher cipher = Cipher.getInstance("Blowfish/ECB/PKCS5Padding");

     cipher.init(Cipher.DECRYPT_MODE, key);

     return cipher.doFinal(bt);

 }

   

 /**

  * @param args

  * @throws Exception

  */

 public static void main(String[] args) throws Exception  {

      Key key = keyGenerator();

      System.out.println("Key : " + Base64.getEncoder().encodeToString(key.getEncoded()));

      String src = "123456";

      byte[] target = encrypt(key, src);

      System.out.println("密文： " + Base64.getEncoder().encodeToString(target));

      System.out.println("明文： " + new String(decrypt(key, target)));

 }
}

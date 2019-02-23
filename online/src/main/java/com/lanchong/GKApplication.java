package com.lanchong;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.servlet.MultipartConfigElement;
import java.io.File;

@SpringBootApplication
@EnableTransactionManagement(proxyTargetClass=true)
//@ComponentScan(basePackages={"com.lanchong.**.service"})
public class GKApplication {
    public static void main(String[] args) {
        SpringApplication.run(GKApplication.class, args);
    }



    @Value("${discuz.dir}")
    String discuzDir;
    @Value("${attachment.forum.dir}")
    String attachmentDir;
    @Value("${jasypt.encryptor.password}")
    String jasyptPwd;
    /**
     * 文件上传临时路径
     *
     *
     */
    @Bean
    MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        String realPath =  new File(discuzDir+ attachmentDir+File.separator+"tmp").getAbsolutePath();
        File file = new File(realPath);
        if(!file.exists()){
            file.mkdirs();
        }
        factory.setLocation(realPath);
        return factory.createMultipartConfig();
    }
}
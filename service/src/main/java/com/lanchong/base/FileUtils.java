package com.lanchong.base;

import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

@Slf4j
public class FileUtils {
    public static void saveAsFile(byte[] b,String fn) throws Exception{
        OutputStream os=null;
        try {
            File f = new File(fn);
            if(!f.exists()){
                createPath(f);
                f.createNewFile();
            }
            os = new FileOutputStream(f);
            os.write(b);
            os.flush();
        } catch (Exception e) {
            log.error("文件保存失败",e);
            throw new Exception("文件保存失败");
        }finally{
            if(os!=null)
                try {
                    os.close();
                } catch (IOException e) {
                    log.error("文件关闭时失败",e);
                    throw new Exception("保存时失败");
                }
        }
    }

    public static void createPath(File f){
        File p = f;
        if(!p.isFile()){
            p = p.getParentFile();
        }
        if(!p.exists())p.mkdirs();
    }
}

package com.lanchong.base;

import it.sauronsoftware.jave.Encoder;
import it.sauronsoftware.jave.EncoderException;
import lombok.extern.slf4j.Slf4j;
import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.channels.FileChannel;

@Slf4j
public class FileUtils {
    public static void saveAsFile(byte[] b, String fn) throws Exception {
        OutputStream os = null;
        try {
            File f = new File(fn);
            if (!f.exists()) {
                createPath(f);
                f.createNewFile();
            }
            os = new FileOutputStream(f);
            os.write(b);
            os.flush();
        } catch (Exception e) {
            log.error("文件保存失败", e);
            throw new Exception("文件保存失败");
        } finally {
            if (os != null)
                try {
                    os.close();
                } catch (IOException e) {
                    log.error("文件关闭时失败", e);
                    throw new Exception("保存时失败");
                }
        }
    }

    public static void createPath(File f) {
        File p = f;
        if (!p.isFile()) {
            p = p.getParentFile();
        }
        if (!p.exists()) p.mkdirs();
    }

    /**
     * 获取视频时长
     *
     * @param source
     * @return
     */
    public static String ReadVideoTime(File source) {
        String length = "";

        Encoder encoder = new Encoder();

        FileChannel fc= null;

        String size = "";

        it.sauronsoftware.jave.MultimediaInfo m = null;
        try {
            m = encoder.getInfo(source);
            long ls = m.getDuration();
            //System.out.println("此视频时长为:"+ls/60000+"分"+(ls)/1000+"秒！");
            System.out.println("此视频时长为:"+(ls)/1000+"秒！");
            size = String.valueOf(ls/1000);
        } catch (EncoderException e) {
            e.printStackTrace();
        }
        return size;
    }


    /**
     * 获取视频大小
     *
     * @param source
     * @return
     */
    public static String ReadFileSize(File source) {
        String size = "";
        try (FileInputStream fis = new FileInputStream(source);
             FileChannel fc = fis.getChannel()) {
            BigDecimal fileSize = new BigDecimal(fc.size());
            size = fileSize.divide(new BigDecimal(1048576), 2, RoundingMode.HALF_UP) + "MB";
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return size;
    }
}

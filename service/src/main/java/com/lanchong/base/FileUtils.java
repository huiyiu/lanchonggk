package com.lanchong.base;

import lombok.extern.slf4j.Slf4j;
import ws.schild.jave.MultimediaInfo;
import ws.schild.jave.MultimediaObject;

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
        try {
            MultimediaObject instance = new MultimediaObject(source);
            MultimediaInfo result = instance.getInfo();
            long ls = result.getDuration() / 1000;
            //int hour = (int) (ls / 3600);
            int minute = (int) (ls % 3600) / 60;
            //int second = (int) (ls - hour * 3600 - minute * 60);
            int second = (int) (ls - - minute * 60);
            length = minute + "''" + second + "'''";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return length;
    }


    /**
     * 获取视频大小
     *
     * @param source
     * @return
     */
    public static String ReadVideoSize(File source) {
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

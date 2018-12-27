package com.lanchong.base;


import com.lanchong.util.StringUtil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Stream;

public class FileTypeUtil {
	// 缓存文件头信息-文件头信息
	public static final Map<String, String> mFileTypes = new HashMap<String, String>();

	static {
		// images
		mFileTypes.put("ffd8ffe000104a464946", "jpg"); //JPEG (jpg)     
		mFileTypes.put("89504e470d0a1a0a0000", "png"); //PNG (png)     
		mFileTypes.put("47494638396126026f01", "gif"); //GIF (gif)     
		mFileTypes.put("49492a00227105008037", "tif"); //TIFF (tif)     
		mFileTypes.put("424d228c010000000000", "bmp"); //16色位图(bmp)     
		mFileTypes.put("424d8240090000000000", "bmp"); //24位位图(bmp)     
		mFileTypes.put("424d8e1b030000000000", "bmp"); //256色位图(bmp)     
		mFileTypes.put("41433130313500000000", "dwg"); //CAD (dwg)     
		mFileTypes.put("3c21444f435459504520", "html"); //HTML (html)
		mFileTypes.put("3c21646f637479706520", "htm"); //HTM (htm)
		mFileTypes.put("48544d4c207b0d0a0942", "css"); //css
		mFileTypes.put("696b2e71623d696b2e71", "js"); //js
		mFileTypes.put("7b5c727466315c616e73", "rtf"); //Rich Text Format (rtf)     
		mFileTypes.put("38425053000100000000", "psd"); //Photoshop (psd)     
		mFileTypes.put("46726f6d3a203d3f6762", "eml"); //Email [Outlook Express 6] (eml)       
		mFileTypes.put("d0cf11e0a1b11ae10000", "doc"); //MS Excel 注意：word、msi 和 excel的文件头一样     
		mFileTypes.put("d0cf11e0a1b11ae10000", "vsd"); //Visio 绘图     
		mFileTypes.put("5374616E64617264204A", "mdb"); //MS Access (mdb)      
		mFileTypes.put("252150532D41646F6265", "ps");
		mFileTypes.put("255044462d312e350d0a", "pdf"); //Adobe Acrobat (pdf)   
		mFileTypes.put("2e524d46000000120001", "rmvb"); //rmvb/rm相同  
		mFileTypes.put("464c5601050000000900", "flv"); //flv与f4v相同  
		mFileTypes.put("00000020667479706d70", "mp4");
		mFileTypes.put("49443303000000002176", "mp3");
		mFileTypes.put("000001ba210001000180", "mpg"); //     
		mFileTypes.put("3026b2758e66cf11a6d9", "wmv"); //wmv与asf相同    
		mFileTypes.put("52494646e27807005741", "wav"); //Wave (wav)  
		mFileTypes.put("52494646d07d60074156", "avi");
		mFileTypes.put("4d546864000000060001", "mid"); //MIDI (mid)   
		mFileTypes.put("504b0304140000000800", "zip");
		mFileTypes.put("526172211a0700cf9073", "rar");
		mFileTypes.put("235468697320636f6e66", "ini");
		mFileTypes.put("504b03040a0000000000", "jar");
		mFileTypes.put("4d5a9000030000000400", "exe");//可执行文件
		mFileTypes.put("3c25402070616765206c", "jsp");//jsp文件
		mFileTypes.put("4d616e69666573742d56", "mf");//MF文件
		mFileTypes.put("3c3f786d6c2076657273", "xml");//xml文件
		mFileTypes.put("494e5345525420494e54", "sql");//xml文件
		mFileTypes.put("7061636b616765207765", "java");//java文件
		mFileTypes.put("406563686f206f66660d", "bat");//bat文件
		mFileTypes.put("1f8b0800000000000000", "gz");//gz文件
		mFileTypes.put("6c6f67346a2e726f6f74", "properties");//bat文件
		mFileTypes.put("cafebabe0000002e0041", "class");//bat文件
		mFileTypes.put("49545346030000006000", "chm");//bat文件
		mFileTypes.put("04000000010000001300", "mxp");//bat文件
		mFileTypes.put("504b0304140006000800", "docx");//docx文件
		mFileTypes.put("d0cf11e0a1b11ae10000", "wps");//WPS文字wps、表格et、演示dps都是一样的
		mFileTypes.put("6431303a637265617465", "torrent");


		mFileTypes.put("6D6F6F76", "mov"); //Quicktime (mov)  
		mFileTypes.put("FF575043", "wpd"); //WordPerfect (wpd)   
		mFileTypes.put("CFAD12FEC5FD746F", "dbx"); //Outlook Express (dbx)     
		mFileTypes.put("2142444E", "pst"); //Outlook (pst)      
		mFileTypes.put("AC9EBD8F", "qdf"); //Quicken (qdf)     
		mFileTypes.put("E3828596", "pwl"); //Windows Password (pwl)         
		mFileTypes.put("2E7261FD", "ram"); //Real Audio (ram)
	}


	/**
	 * @param filePath 文件路径
	 * @return 文件头信息
	 * @author guoxk
	 * <p>
	 * 方法描述：根据文件路径获取文件头信息
	 */
	public static String getFileType(String filePah){
		String res = null;
		try {
			FileInputStream is = new FileInputStream(filePah);
			byte[] b = new byte[10];
			is.read(b, 0, b.length);
			String fileCode = bytesToHexString(b);

			//System.out.println(fileCode);

			//这种方法在字典的头代码不够位数的时候可以用但是速度相对慢一点
			Iterator<String> keyIter = mFileTypes.keySet().iterator();
			while(keyIter.hasNext()){
				String key = keyIter.next();
				if(key.toLowerCase().startsWith(fileCode.toLowerCase()) || fileCode.toLowerCase().startsWith(key.toLowerCase())){
					res = mFileTypes.get(key);
					break;
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return res;
	}

	/**
	 * @param src 要读取文件头信息的文件的byte数组
	 * @return 文件头信息
	 * @author guoxk
	 * <p>
	 * 方法描述：将要读取文件头信息的文件的byte数组转换成string类型表示
	 */
	public static String bytesToHexString(byte[] src) {
		StringBuilder stringBuilder = new StringBuilder();
		if (src == null || src.length <= 0) {
			return null;
		}
		for (int i = 0; i < src.length; i++) {
			int v = src[i] & 0xFF;
			String hv = Integer.toHexString(v);
			if (hv.length() < 2) {
				stringBuilder.append(0);
			}
			stringBuilder.append(hv);
		}
		return stringBuilder.toString();
	}


	public static boolean isImage(String type){
		return Arrays.asList("jpg,png,gif,bmp".split(",")).stream().filter(suffix->null != type && type.equalsIgnoreCase(suffix)).map(any->!StringUtil.isEmpty(any)).findFirst().orElse(false);
	}

	public static boolean isVideo(String type){
		return Arrays.asList("map4".split(",")).stream().filter(suffix->null != type && type.equalsIgnoreCase(suffix)).map(any->!StringUtil.isEmpty(any)).findFirst().orElse(false);
	}

	/**
	 * @param args
	 * @throws Exception
	 * @author guoxk
	 * <p>
	 * 方法描述：测试
	 */
	public static void main(String[] args) throws Exception {
		final String fileType = getFileType("C:\\Users\\admin\\Desktop\\开票信息 - 工会.docx");
		System.out.println(fileType);
	}

}
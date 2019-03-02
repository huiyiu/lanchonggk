package com.lanchong.controller2;

import com.github.jscookie.javacookie.Cookies;
import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.google.code.kaptcha.util.Config;
import com.google.gson.Gson;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

@Controller
@RequestMapping(value="")
@Slf4j
public class GlobalController {
	/*@RequestMapping(value = "/500.html")
	public String get500Page() {
		return "500";
	}

	@RequestMapping(value = "/404.html")
	public String get404Page() {
		return "404";
	}*/
	@ApiOperation(value = "获取图形验证码", notes = "获取图形验证码")
	@GetMapping(value = "/verifyCode")
	public void verifyCode(HttpServletRequest request, HttpServletResponse response) {

		Properties properties = new Properties();
		properties.put("kaptcha.image.width", "100");
		properties.put("kaptcha.image.height", "40");
		properties.put("kaptcha.textproducer.char.string", "0123456789");
		properties.put("kaptcha.textproducer.char.length", "4");
		properties.put("kaptcha.border", "no");
		properties.put("kaptcha.border.color", "105,179,90");
		properties.put("kaptcha.border.thickness", "1");
		properties.put("kaptcha.textproducer.font.color", "black");
		properties.put("kaptcha.textproducer.font.size", "30");
		properties.put("kaptcha.textproducer.font.names", "BKamrnBd");
		properties.put("kaptcha.textproducer.char.space", "3");
		properties.put("kaptcha.noise.color", "gray");//"red");
		properties.put("kaptcha.obscurificator.impl", "");//"com.google.code.kaptcha.impl.ShadowGimpy");
		Config config = new Config(properties);

		DefaultKaptcha kaptch = new DefaultKaptcha();
		kaptch.setConfig(config);

		response.setDateHeader("Expires", 0);
		response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
		response.addHeader("Cache-Control", "post-check=0, pre-check=0");
		response.setHeader("Pragma", "no-cache");
		response.setContentType("image/jpeg");
		String capText = kaptch.createText();
		String codecode = DigestUtils.md5Hex(DigestUtils.md5Hex(capText)+"TH");

		BufferedImage bi = kaptch.createImage(capText);
	//	String vcId = ""+ DatabaseUtil.getDatabasePriykey();
//		if(RedisService.enabled){
//			RedisService.set(RedisServerKeys.IMG_VC+vcId, codecode, 20*60);
//			CookieUtil.setCookie(response,"vcId",vcId,20*60);
//		}else{
//			CookieUtil.setCookie(response, "vc", codecode, 0);
//		}
//		CookieUtil.setCookie(response, "vct", capText, 0);
		Cookies cookies = Cookies.initFromServlet(request,response);
		cookies.set("vc",codecode);

		try (ServletOutputStream out = response.getOutputStream()){
			ImageIO.write(bi, "jpg", out);
		}catch (Exception e){
			log.warn("生成图片验证码失败："+e.getMessage());
		}
	}

	/*@PostMapping(value="/upload")
	@ResponseBody
	public String upload(@RequestParam MultipartFile picFile){
		Map<String,String>m = new HashMap<>();


		return new Gson().toJson(m);
	}*/
}
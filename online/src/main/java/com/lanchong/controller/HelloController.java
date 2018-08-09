package com.lanchong.controller;

import com.google.gson.Gson;
import com.lanchong.ucenter.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {
    @Autowired
    DemoService demoService;

    @RequestMapping("hi")
    public String hello(){
       return new Gson().toJson(demoService.getByEmail());
    }
}

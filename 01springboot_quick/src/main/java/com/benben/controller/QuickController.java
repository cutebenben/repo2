package com.benben.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QuickController {

    @RequestMapping("/quick")     //配置地址localhost:8080/quick
    @ResponseBody
    public String quick(){
        return "hello springboot";
    }
}

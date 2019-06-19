package com.emuel.tools.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/home")
public class BaseController {

    
    @RequestMapping("/home")
    public String home(){
        return "home";
    }
}

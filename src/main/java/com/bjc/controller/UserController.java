package com.bjc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping(value = "hello.do",method = {RequestMethod.GET,RequestMethod.POST})
    public String hello(){
        return "index";
    }
}

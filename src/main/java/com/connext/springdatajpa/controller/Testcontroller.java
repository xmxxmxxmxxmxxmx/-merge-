package com.connext.springdatajpa.controller;

/**
 * @author xiamingxing
 * @date 2019/1/12 15:01
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Testcontroller {
    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "xmx";
    }
}

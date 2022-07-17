package com.staeroexample.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class responseController {

    @RequestMapping(value="/")
    public String indexPage(){
        return "index.html";
    }

}

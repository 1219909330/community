package com.zxl.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
/*
* 斜杠代表着根目录,既相当于我任何都不输入的时候,默认访问路径index
* */
    @GetMapping("/")
    public String index(){
        return "index";

    }

}

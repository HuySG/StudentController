package com.example.demospringboot.controller;

// @Controller : cho phép định nghĩa đường dẫn thường là trả về file html
// @ResponseBody: chỉ trả về String
// @RestController: @Controler + @ResponseBody cho phép định nghĩa  dường dẫn là luôn luôn trả về String

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("")
    public String demo() {
        return "Hello demo ";
    }

    @GetMapping("/hello")
    public String Hello() {
        return "Hello";
    }
    @GetMapping("/detail")
    public String detail(){
        return "Detail";
    }
}

package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class myController {

    @RequestMapping("/hello")
    public String hello(){
        return "test";
    }
}

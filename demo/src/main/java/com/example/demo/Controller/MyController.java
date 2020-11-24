package com.example.demo.Controller;

import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/Home","/","","/home"})
public class MyController {

    @RequestMapping({"/hello","/Hello"})
    public String Hello(){
        return "addpost";
    }

    @RequestMapping({"/Log","/log"})
    public String Log(){
        return "Loginpage";
    }

    @RequestMapping({"/Edit","/edit"})
    public String Edit(){return "main";}

    @RequestMapping({"/Search","/search"})
    public String Search(){return "searchpost";}
}

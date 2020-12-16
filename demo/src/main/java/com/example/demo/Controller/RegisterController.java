package com.example.demo.Controller;


import com.example.demo.Services.UserService;
import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class RegisterController {

    @RequestMapping("salam")
    public String safhe(){
        return "registerUser";
    }
    private UserService userService;


    @RequestMapping(value = "/nuser" , method = RequestMethod.GET)
    public String users(Model model) {
        model.addAttribute("ozvha" , userService.FindAllOzvhas());
        return "user";
    }

    @RequestMapping(value = "" , method = RequestMethod.GET)
    public String users() {
        return "user";
    }

    @RequestMapping(value = "/register" , method = RequestMethod.GET)
    public String registerPage() {
        return "registerUser";
    }




}

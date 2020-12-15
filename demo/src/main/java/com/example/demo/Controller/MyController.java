package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/Home","/","","/home"})
public class MyController {

    @RequestMapping({"/Signup","/signup", "Signuppage.html"})
    public String Sign(){return "signuppage";}

    @RequestMapping({ "" ,"/","/main","/Main", "main.html"})
    public String Main(){
        return "main";
    }


    @RequestMapping({"/addpost","/add", "addpoost.html"})
    public String Add(){
        return "addpost";
    }

    @RequestMapping({"/Log","/login", "Loginpage.html"})
    public String Log(){
        return "Loginpage";
    }

    @RequestMapping({"profile.html"})
    public String profile(){return "profile";}

    @RequestMapping({"editprofile.html"})
    public String Edit(){return "editprofile";}

    @RequestMapping("/searchpost.html")
    public String Search(){return "searchpost";}

    @RequestMapping("/searchuser.html")
    public String Search_user(){return "searchuser";}





}

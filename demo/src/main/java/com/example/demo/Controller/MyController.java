package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/Home","/","","/home"})
public class MyController {



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

    @RequestMapping({"editprofile.html" , "edit" , "editprofile"})
    public String Edit(){return "editprofile";}

    @RequestMapping({"/searchpost.html","searchpost"})
    public String Search(){return "searchpost";}

    @RequestMapping({"/searchuser.html" , "searchuser"})
    public String Search_user(){return "searchuser";}

    @RequestMapping({"/Signup","/signup", "Signuppage.html"})
    public String Sign(){return "signuppage";}



}

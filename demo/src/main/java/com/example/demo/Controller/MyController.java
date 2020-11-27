package com.example.demo.Controller;

import com.example.demo.Repository.IRepositoryUser;
import com.example.demo.Services.UserService;
import org.omg.PortableInterceptor.ServerRequestInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/Home","/","","/home"})
public class MyController {


    @Autowired
    private IRepositoryUser UserRipo;


    @Autowired
    private UserService userService;


    @RequestMapping({"/showuser" , "/Showuser"})
    public String showuser(Model model){

        model.addAttribute("users" , userService.getUser());

        return "loginpage";
    }




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

    @RequestMapping({"/Signup","/signup", "Signuppage.html"})
    public String Sign(){return "signuppage";}



}

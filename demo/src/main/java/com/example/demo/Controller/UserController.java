package com.example.demo.Controller;


import ch.qos.logback.core.CoreConstants;
import com.example.demo.Entity.ozvha;
import com.example.demo.Repository.UserRepository;
import com.example.demo.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/user" , "/User" , "/"})
public class UserController {

    private UserService userService;

    //---------------------------------------------------
    private ozvha ozv;

    private  UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    //@Autowired
    public void setUser(ozvha user) {
        this.ozv = user;
    }



    //-----------------
    @PostMapping("/sign")
    @RequestMapping({"/sign","sign","Sign"})
    public String sign_submit(@ModelAttribute ozvha ozv){
        String username = ozv.getUsername();
        String email = ozv.getEmail();
        String password = ozv.getPassword();
        //String password2 = ozv.getPassword();
        if (password != password){
            System.out.print("not match password");
            return "/home/Signuppage";
        }
        userRepository.save(ozv);
        userRepository.insertUser(username , email , password);
        return "/home/main";
    }
    //-----------------
    /*
    @PostMapping("/log")
    @RequestMapping({"/Log","log","Log"})
    public String log_submit(@ModelAttribute ozvha ozv) {
        String email = ozv.getEmail();
        //boolean boool = userRepository.findByEmail(email);
        String emaildb = ozv.getEmail();
        String passworddb = ozv.getPassword();

        if (email == emaildb && passworddb == "1"){
            System.out.print("Sucsesfuly");

            return "main";
        }
        else {
            System.out.print("invalid email or pasword");
            return "invalid";
        }
    }
    */

    //---------------------------------------------------

    @Autowired
    public UserController(UserService UserService){
        this.userService = UserService;
    }

    @RequestMapping(value = {"/" , ""} , method = RequestMethod.GET)

    public List<ozvha> getusers(){
        return this.userService.FindAllOzvhas();
    }


    @RequestMapping(value = {"/" , ""} , method = RequestMethod.POST)
    public ozvha RegisterUser(@RequestBody ozvha ozvha){

       return userService.RegisterUser(ozvha);
    }




}

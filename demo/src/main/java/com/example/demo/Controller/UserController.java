package com.example.demo.Controller;


import com.example.demo.Entity.ozvha;
import com.example.demo.Repository.UserRepository;
import com.example.demo.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping({"/user" , "/User"})
public class UserController {

    private UserService userService;

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

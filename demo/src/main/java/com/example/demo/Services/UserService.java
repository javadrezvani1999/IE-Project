package com.example.demo.Services;

import com.example.demo.Entity.ozvha;
import com.example.demo.Repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }


    public ozvha RegisterUser(ozvha ozvha){

        return this.userRepository.save(ozvha);
    }


    public List<ozvha> FindAllOzvhas(){

        return this.userRepository.findAll();
    }



}




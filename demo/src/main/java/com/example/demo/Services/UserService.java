package com.example.demo.Services;

import com.example.demo.Entity.User;
import com.example.demo.Model.UserModel;
import com.example.demo.Repository.IRepositoryUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class UserService {

    @Autowired
    private IRepositoryUser userripo;

    public List<UserModel> getUser(){

        List users = userripo.findAll();


        ArrayList<UserModel> Resault = new ArrayList<>();
        for (User user:(List<User>) users){

            Resault.add(new UserModel(user.getUser_name()));
        }
        return Resault;
    }


}




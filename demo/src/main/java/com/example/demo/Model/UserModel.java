package com.example.demo.Model;

import javax.sql.rowset.spi.SyncResolver;

public class UserModel {

    private String UserName;


    public UserModel(String userName){

        this.UserName = userName;


    }


    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }
}

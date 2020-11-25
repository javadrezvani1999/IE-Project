package com.example.demo.Entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "likes")
public class likes {

    @Id
    @Column(name = "post_id")
    private int post_id;



    public int getPost_id() {
        return post_id;
    }

    public void setPost_id(int post_id) {
        post_id = post_id;
    }



    @Column(name = "user_name")
    private String user_name;

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }



    @Column(name = "like_date")
    private Date like_date;

    public Date getLike_date() {
        return like_date;
    }

    public void setLike_date(Date like_date) {
        this.like_date = like_date;
    }

    public likes(){
        
    }
}

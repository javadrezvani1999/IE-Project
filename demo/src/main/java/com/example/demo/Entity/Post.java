package com.example.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="post")
public class Post {

    public Post() {
    }

    @Id
    @Column(name="post_id")
    private int post_id;

    public int getPost_id() {
        return post_id;
    }

    public void setPost_id(int post_id) {
        this.post_id = post_id;
    }

    @Column(name="post_pic")
    private String Post_pic;

    public String getPost_pic() {
        return Post_pic;
    }

    public void setPost_pic(String post_pic) {
        Post_pic = post_pic;
    }


    @Column(name="post_des")
    private String post_des;

    public String getPost_des() {
        return post_des;
    }

    public void setPost_des(String post_des) {
        this.post_des = post_des;
    }

    @Column(name="post_date")
    private Date post_date;

    public Date getPost_date() {
        return post_date;
    }

    public void setPost_date(Date post_date) {
        this.post_date = post_date;
    }

    @Column(name="post_name")
    private String post_name;

    public String getPost_name() {
        return post_name;
    }

    public void setPost_name(String post_name) {
        this.post_name = post_name;
    }









}

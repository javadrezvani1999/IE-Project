package com.example.demo.Entity;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class ozvha {
    @Id
    @GeneratedValue
    private int id;
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}


    @OneToMany(mappedBy = "ozvha")
    private List<Posts> posts;

    public List<Posts> getPosts() {
        return posts;
    }

    public void setPosts(List<Posts> posts) {
        this.posts = posts;
    }

    private String username;
    public String getUsername() {return username;}
    public void setUsername(String username) {this.username = username;}


    private String password;
    public String getPassword() {return password;}
    public void setPassword(String password) {this.password = password;}


    private String email;
    public String getEmail() { return email;}
    public void setEmail(String email) {this.email = email;}


    private int followingnb;
    public int getFollowingnb() {return followingnb;}
    public void setFollowingnb(int followingnb) {this.followingnb = followingnb;}


    private int followernb;
    public int getFollowernb() {return followernb;}
    public void setFollowernb(int followernb) {this.followernb = followernb;}


    private LocalDateTime createdAT;
    public LocalDateTime getCreatedAT() {return createdAT;}
    public void setCreatedAT(LocalDateTime createdAT) {this.createdAT = createdAT;}


    private LocalDateTime updatedAT;
    public LocalDateTime getUpdatedAT() {return updatedAT;}
    public void setUpdatedAT(LocalDateTime updatedAT) {this.updatedAT = updatedAT;}



    public ozvha() { }

    public ozvha(String username, String password, String email, int followingnb, int followernb) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.followingnb = followingnb;
        this.followernb = followernb;
    }
}

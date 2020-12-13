package com.example.demo.Controller;



import com.fasterxml.jackson.databind.ObjectMapper;
import com.example.demo.Entity.Posts;
import com.example.demo.Services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {

    private PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @RequestMapping("/newPost")
    public Posts newPost(@RequestBody Posts posts) {
        return postService.registerPost(posts);
    }

    @RequestMapping("/getPosts")
    public List<Posts> getPosts() {
        return postService.findAll();
    }


}

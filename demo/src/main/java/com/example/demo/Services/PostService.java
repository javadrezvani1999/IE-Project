package com.example.demo.Services;

import com.example.demo.Entity.Posts;
import com.example.demo.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service


public class PostService {

    private PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Posts> findAll() {
        return postRepository.findAll();
    }

    @Transactional
    public Posts registerPost(Posts posts)  {
        return postRepository.save(posts);
    }
}

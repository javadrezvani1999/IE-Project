package com.example.demo.Repository;

import com.example.demo.Entity.Posts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface PostRepository extends JpaRepository<Posts,Long> {

}
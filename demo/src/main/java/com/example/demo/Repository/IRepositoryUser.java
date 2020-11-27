package com.example.demo.Repository;

import com.example.demo.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IRepositoryUser extends JpaRepository<User,Long> {


}

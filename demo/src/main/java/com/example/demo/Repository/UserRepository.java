package com.example.demo.Repository;

import com.example.demo.Entity.ozvha;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<ozvha,Long> {

    ozvha findByEmail(String email);


}

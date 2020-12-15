package com.example.demo.Repository;

import com.example.demo.Entity.ozvha;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<ozvha,Long> {

    ozvha findByEmail(String email);

    //ozvha findByConfirmationToken(String confirmationToken);
    @Query(value =
            "insert into ozvha (username,email, password) VALUES (:username, :email, :password)",nativeQuery = true)
    void insertUser(@Param("username") String name,
                    @Param("email") String email,
                    @Param("password") String password);


}

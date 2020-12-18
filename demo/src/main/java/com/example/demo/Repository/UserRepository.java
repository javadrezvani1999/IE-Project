package com.example.demo.Repository;

import com.example.demo.Entity.ozvha;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<ozvha,Long> , CrudRepository<ozvha,Long> {

    ozvha findByEmail(String email);

    //ozvha findByConfirmationToken(String confirmationToken);
    @Query(value =
            "insert into ozvha (id , username  ,email, password , enabled , followernb , followingnb) VALUES (:id , :username, :email, :password , :enabled ,  :followernb , :followingnb )",nativeQuery = true)
    void insertUser(@Param("id") int id,
                    @Param("username") String name,
                    @Param("email") String email,
                    @Param("password") String password,
                    @Param("enabled") boolean enabled,
                    @Param("followernb") int followernb,
                    @Param("followingnb") int followingnb);




    @Query(value = "SELECT * FROM ozvha WHERE EMAIL_ADDRESS = ?0", nativeQuery = true)
    ozvha findByEmailAddress(String emailAddress);





}

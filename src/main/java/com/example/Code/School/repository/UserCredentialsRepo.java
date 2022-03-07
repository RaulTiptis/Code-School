package com.example.Code.School.repository;

import com.example.Code.School.model.UserCredentials;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Transactional
@Repository
public interface UserCredentialsRepo extends JpaRepository<UserCredentials, Integer> {
    Optional<UserCredentials> findByEmail(String email);

    @Transactional
    @Modifying
    @Query("UPDATE UserCredentials a " +
            "SET a.enabled = TRUE WHERE a.email = ?1")
    int enableUserCredentials(String email);
}

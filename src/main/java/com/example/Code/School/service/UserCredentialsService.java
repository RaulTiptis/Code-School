package com.example.Code.School.service;

import com.example.Code.School.model.UserCredentials;
import com.example.Code.School.registration.token.ConfirmationToken;
import com.example.Code.School.registration.token.ConfirmationTokenService;
import com.example.Code.School.repository.UserCredentialsRepo;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class UserCredentialsService implements UserDetailsService {

    private final UserCredentialsRepo userCredentialsRepo;

    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    private final ConfirmationTokenService confirmationTokenService;

    @Override
    public UserDetails loadUserByUsername(String email)
            throws UsernameNotFoundException {
        return userCredentialsRepo.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("Email not found"));
    }

    public String signUpUser(UserCredentials userCredentials) {
        boolean userExists = userCredentialsRepo.findByEmail(userCredentials.getEmail()).isPresent();
        if(userExists){
            throw new IllegalStateException("Email already exists");
        }
        String encodedPassword = bCryptPasswordEncoder.encode(userCredentials.getPassword());
        userCredentials.setPassword(encodedPassword);

        userCredentialsRepo.save(userCredentials);

        String token = UUID.randomUUID().toString();
        ConfirmationToken confirmationToken = new ConfirmationToken(
                token, LocalDateTime.now(), LocalDateTime.now().plusMinutes(15), userCredentials
        );

        confirmationTokenService.saveConfirmationToken(confirmationToken);
        return token;
    }

    public int enableUserCredentials(String email) {
        return userCredentialsRepo.enableUserCredentials(email);
    }

    public List<UserCredentials> findAllUsers() {
        return userCredentialsRepo.findAll();
    }
}

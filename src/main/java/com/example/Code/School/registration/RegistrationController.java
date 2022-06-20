package com.example.Code.School.registration;

import com.example.Code.School.model.UserCredentials;
import com.example.Code.School.service.ProgressService;
import com.example.Code.School.service.UserCredentialsService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/registration")
@AllArgsConstructor
public class RegistrationController {

    private final RegistrationService registrationService;
    private final ProgressService progressService;
    private final UserCredentialsService userCredentialsService;

    @PostMapping
    public String register(@RequestBody RegistrationRequest request){
        return registrationService.register(request);
    }

    @GetMapping(path = "confirm")
    public String confirm(@RequestParam("token") String token) {
        return registrationService.confirmToken(token);
    }

    @GetMapping("/all")
    public ResponseEntity<List<UserCredentials>> getAllUsers(){
        List<UserCredentials> users = userCredentialsService.findAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
}

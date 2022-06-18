package com.example.Code.School.registration;

import com.example.Code.School.model.Progress;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class RegistrationRequest {
    private final String email;
    private final String password;
    private final String username;
    private final Progress progress;
}

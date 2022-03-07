package com.example.Code.School.email;

public interface EmailSender {
    default void send(String to, String email){

    }
}

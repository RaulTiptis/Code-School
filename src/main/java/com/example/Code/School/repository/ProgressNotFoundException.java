package com.example.Code.School.repository;

public class ProgressNotFoundException extends RuntimeException{
    public ProgressNotFoundException(String message){
        super(message);
    }
}
package com.example.Code.School.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Suggestion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String suggestion;

    public Suggestion(){}

    public Suggestion(String suggestion){
        this.suggestion = suggestion;
    }

    private String getSuggestion(){
        return suggestion;
    }

    private void setSuggestion(String suggestion){
        this.suggestion = suggestion;
    }
}
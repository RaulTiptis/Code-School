package com.example.Code.School.service;

import com.example.Code.School.model.Suggestion;
import com.example.Code.School.repository.SuggestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SuggestionService {

    private final SuggestionRepo suggestionRepo;

    @Autowired
    public SuggestionService(SuggestionRepo suggestionRepo){
        this.suggestionRepo = suggestionRepo;
    }

    public Suggestion addSuggestion(Suggestion suggestion){
        return suggestionRepo.save(suggestion);
    }
}

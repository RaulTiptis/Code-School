package com.example.Code.School.controller;

import com.example.Code.School.model.Progress;
import com.example.Code.School.model.Suggestion;
import com.example.Code.School.service.SuggestionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/suggestion")
public class SuggestionController {

    private final SuggestionService suggestionService;

    public SuggestionController(SuggestionService suggestionService){
        this.suggestionService = suggestionService;
    }

    @PostMapping("/add")
    public ResponseEntity<Suggestion> addSuggestion(@RequestBody String suggestion){
        Suggestion suggestion1 = new Suggestion(suggestion);
        Suggestion newSuggestion = suggestionService.addSuggestion(suggestion1);
        return new ResponseEntity<>(newSuggestion, HttpStatus.CREATED);
    }
}

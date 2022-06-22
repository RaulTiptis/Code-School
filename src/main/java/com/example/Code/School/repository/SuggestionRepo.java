package com.example.Code.School.repository;

import com.example.Code.School.model.Suggestion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SuggestionRepo extends JpaRepository<Suggestion, Integer> {

    void deleteSuggestionById(Integer id);

    Optional<Suggestion> findSuggestionById(Integer id);
}

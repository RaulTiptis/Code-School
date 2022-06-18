package com.example.Code.School.repository;


import com.example.Code.School.model.Progress;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProgressRepo extends JpaRepository<Progress, Integer> {

    void deleteProgressById(Integer id);

    Optional<Progress> findProgressById(Integer id);
}

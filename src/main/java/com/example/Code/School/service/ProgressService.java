package com.example.Code.School.service;

import com.example.Code.School.model.Progress;
import com.example.Code.School.repository.ProgressNotFoundException;
import com.example.Code.School.repository.ProgressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProgressService {

    private final ProgressRepo progressRepo;
    @Autowired
    ProgressService(ProgressRepo progressRepo){
        this.progressRepo = progressRepo;
    }

    public Progress addProgress(Progress progress){
        return progressRepo.save(progress);
    }

    public Progress updateProgress(Progress progress){
        return progressRepo.save(progress);
    }

    public Progress findProgressById(Integer id){
        return progressRepo.findProgressById(id)
                .orElseThrow(() -> new ProgressNotFoundException("Progress with id: " + id + "has not been found"));
    }

    public void deleteProgress(Integer id){
        progressRepo.deleteProgressById(id);
    }
}

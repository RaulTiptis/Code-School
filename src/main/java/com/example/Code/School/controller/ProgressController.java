package com.example.Code.School.controller;

import com.example.Code.School.model.Progress;
import com.example.Code.School.service.ProgressService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/progress")
public class ProgressController {

    private final ProgressService progressService;

    ProgressController(ProgressService progressService){
        this.progressService = progressService;
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Progress> getProgressById(@PathVariable("id") Integer id){
        Progress progress = progressService.findProgressById(id);
        return new ResponseEntity<>(progress, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Progress> addProgress(){
        Progress progress = new Progress();
        Progress newProgress = progressService.addProgress(progress);
        return new ResponseEntity<>(newProgress, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Progress> updateProgress(@RequestBody Progress progress){
        Progress updateProgress = progressService.updateProgress(progress);
        return new ResponseEntity<>(updateProgress, HttpStatus.OK);
    }

    @Transactional
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteUserById(@PathVariable("id") Integer id){
        progressService.deleteProgress(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

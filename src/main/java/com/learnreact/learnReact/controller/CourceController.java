package com.learnreact.learnReact.controller;

import com.learnreact.learnReact.model.Cources;
import com.learnreact.learnReact.services.CourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//import javax.validation.Valid;
import java.util.List;

@RestController
public class CourceController {
    @Autowired
    private CourceService courceService;
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/getCources")
    public ResponseEntity<List<Cources>> getCources(){
        List<Cources> cources = this.courceService.getCources();
        return new ResponseEntity<>(cources,HttpStatus.OK);

    }
    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/saveCource")
    public ResponseEntity<Cources> saveCources(@RequestBody Cources cource){
        Cources cources = this.courceService.saveCources(cource);
        return new ResponseEntity<>(cources,HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping("/deleteCourse/{id}")
    public void deleteCourse(@PathVariable int id){
        this.courceService.deleteCourse(id);
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @PutMapping("/updateCourse")
    public void updateCourse(@RequestBody Cources cources){
        this.courceService.updateCourse(cources);
    }

}

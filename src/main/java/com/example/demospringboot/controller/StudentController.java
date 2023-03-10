package com.example.demospringboot.controller;

import com.example.demospringboot.model.StudentModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    List<StudentModel> studentModels = new ArrayList<>();

    @PostMapping("")
    public ResponseEntity<?> insertByParam(@RequestParam String name, @RequestParam int age) {
        StudentModel studentModel = new StudentModel();
        studentModel.setName(name);
        studentModel.setAge(age);
        studentModels.add(studentModel);

        return new ResponseEntity<>(studentModels, HttpStatus.OK);
    }

    @PostMapping("{name}/{age}")
    public ResponseEntity<?> insertByPath(@PathVariable String name, @PathVariable int age) {
        StudentModel studentModel = new StudentModel();
        studentModel.setName(name);
        studentModel.setAge(age);
        studentModels.add(studentModel);

        return new ResponseEntity<>(studentModels, HttpStatus.OK);
    }

    @PutMapping("")
    public ResponseEntity<?> insertByBody(@RequestBody StudentModel studentModel) {

        studentModels.add(studentModel);

        return new ResponseEntity<>(studentModels, HttpStatus.OK);
    }
}

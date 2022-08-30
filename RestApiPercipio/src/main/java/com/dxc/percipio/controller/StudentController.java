package com.dxc.percipio.controller;

import com.dxc.percipio.model.Students;
import com.dxc.percipio.service.Imp.StudentServiceImpl;
import com.dxc.percipio.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    StudentServiceImpl studentService;

    @GetMapping("/students")
    ResponseEntity<List<Students>> getAllStudents(){
        List<Students> allStudents = studentService.findAllStudents();

        return new ResponseEntity<>(allStudents, HttpStatus.OK);
    }

}

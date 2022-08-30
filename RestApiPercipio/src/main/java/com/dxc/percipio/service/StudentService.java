package com.dxc.percipio.service;

import com.dxc.percipio.model.Students;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentService {
    void createStudent();
    List<Students> findAllStudents();
    Students findStudentsById(int studentId);

}

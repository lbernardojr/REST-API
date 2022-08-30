package com.dxc.percipio.service.Imp;

import com.dxc.percipio.model.Students;
import com.dxc.percipio.repository.StudentRepository;
import com.dxc.percipio.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final Logger log = LoggerFactory.getLogger(StudentServiceImpl.class);

    @Autowired
    StudentRepository studentRepository;

    @Override
    public void createStudent() {
    }

    @Override
    public List<Students> findAllStudents() {
        log.info("Fetching all students");
        return studentRepository.findAll();
    }

    @Override
    public Students findStudentsById(int studentId) {
        return null;
    }
}

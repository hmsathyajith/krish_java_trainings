package com.sathyajith.rentacar.demoapplication.service;

import com.sathyajith.rentacar.demoapplication.model.Student;
import com.sathyajith.rentacar.demoapplication.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StdentServiceImpl implements StudentService{

    @Autowired
    StudentRepository studentRepository;

    public Student save(Student student){
        return studentRepository.save(student);
    }

    public Student fetchStudentById(int id){
        Optional<Student> student= studentRepository.findById(id);
        if(student.isPresent()){
            return student.get();
        }
        return null;
    }
}

package com.sathyajith.rentacar.demoapplication.service;

import com.sathyajith.rentacar.demoapplication.model.Student;

public interface StudentService {

    Student save(Student student);

    Student fetchStudentById(int id);
}

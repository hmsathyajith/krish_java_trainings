package com.sathyajith.rentacar.demoapplication.repository;

import com.sathyajith.rentacar.demoapplication.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student, Integer> {

}


package com.krishantha.training.salesmanager.repository;

import com.krishantha.training.salesmanager.model.Employee;

import java.util.List;

public interface EmployeeRepository {
    List<Employee> getAllEmployees();
}

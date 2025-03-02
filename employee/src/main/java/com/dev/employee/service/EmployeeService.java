package com.dev.employee.service;

import com.dev.employee.dto.EmployeeDTO;
import com.dev.employee.entity.Employee;
import java.util.List;

public interface EmployeeService {
    Employee createEmployee(EmployeeDTO employee);
    List<Employee> getAllEmployees();
    Employee getEmployeeById(Long id);
    Employee updateEmployee(Long id, Employee employeeDetails);
    void deleteEmployee(Long id);
}


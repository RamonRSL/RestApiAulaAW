package com.api.crud.APIRest.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.crud.APIRest.models.Employee;
import com.api.crud.APIRest.repositories.EmployeeRepository;

@Service
public class EmployeeService {
@Autowired
private EmployeeRepository employeeRepository;

public List<Employee> findAll() {
    return employeeRepository.findAll();
    }
    public Optional<Employee> findById(Long id) {
    return employeeRepository.findById(id);
    }

    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
        }
        public void deleteById(Long id) {
        employeeRepository.deleteById(id);
        }
}
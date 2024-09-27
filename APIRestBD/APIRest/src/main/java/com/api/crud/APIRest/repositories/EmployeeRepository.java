package com.api.crud.APIRest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.api.crud.APIRest.models.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}


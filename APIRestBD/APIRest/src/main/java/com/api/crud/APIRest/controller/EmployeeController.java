package com.api.crud.APIRest.controller;

import java.util.List;
import java.util.Optional;
import
org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.api.crud.APIRest.models.Employee;
import com.api.crud.APIRest.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
// Injeção de dependência do serviço de funcionários
@Autowired
private EmployeeService employeeService;

@GetMapping
public List<Employee> getAllEmployees() {
// Chama o serviço para obter todos os funcionários
return employeeService.findAll();
}


@GetMapping("/{id}")
public ResponseEntity<Employee>
getEmployeeById(@PathVariable Long id) {
Optional<Employee> employee =
employeeService.findById(id);
return employee.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
}

@PostMapping
public Employee createEmployee(@RequestBody Employee
employee) {
return employeeService.save(employee);
}

@PutMapping("/{id}")
public ResponseEntity<Employee>
updateEmployee(@PathVariable Long id, @RequestBody Employee
employeeDetails) {
Optional<Employee> employee =
employeeService.findById(id);


if (employee.isPresent()) {
    // Atualiza os detalhes do funcionário
    Employee updatedEmployee = employee.get();
    updatedEmployee.setFirstName(employeeDetails.getFirstName());
    updatedEmployee.setLastName(employeeDetails.getLastName());
    updatedEmployee.setDepartment(employeeDetails.getDepartment());
    updatedEmployee.setBirthdate(employeeDetails.getBirthdate());
    updatedEmployee.setCv(employeeDetails.getCv());
return
ResponseEntity.ok(employeeService.save(updatedEmployee)
);

} else {
    return ResponseEntity.notFound().build();
    }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void>
    deleteEmployee(@PathVariable Long id) {
        employeeService.deleteById(id); 
        return ResponseEntity.noContent().build();
}
}
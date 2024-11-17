package com.dvchinx.companyemployees.web.controller;

import com.dvchinx.companyemployees.persistence.entity.EmployeeEntity;
import com.dvchinx.companyemployees.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<EmployeeEntity>> getAllEmployees() {
        return ResponseEntity.ok(employeeService.getAllEmployees());
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<EmployeeEntity> getEmployeeById(@PathVariable String id) {
        return ResponseEntity.ok(employeeService.getEmployeeById(id));
    }

    @PostMapping("/save")
    public ResponseEntity<EmployeeEntity> save(@RequestBody EmployeeEntity entity) {
        return ResponseEntity.ok(employeeService.saveEmployee(entity));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable String id) {
        employeeService.deleteEmployee(id);
        return ResponseEntity.ok().build();
    }
}

package com.dvchinx.companyemployees.service;

import com.dvchinx.companyemployees.persistence.entity.EmployeeEntity;
import com.dvchinx.companyemployees.persistence.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<EmployeeEntity> getAllEmployees() {
        return (List<EmployeeEntity>) employeeRepository.findAll();
    }

    public EmployeeEntity getEmployeeById(String id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public EmployeeEntity saveEmployee(EmployeeEntity employee) {
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(String id) {
        employeeRepository.deleteById(id);
    }
}

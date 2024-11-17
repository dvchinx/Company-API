package com.dvchinx.companyemployees.persistence.repository;

import com.dvchinx.companyemployees.persistence.entity.EmployeeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<EmployeeEntity, String> {
}

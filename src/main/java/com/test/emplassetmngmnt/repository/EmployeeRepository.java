package com.test.emplassetmngmnt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.test.emplassetmngmnt.beans.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, String> {
}

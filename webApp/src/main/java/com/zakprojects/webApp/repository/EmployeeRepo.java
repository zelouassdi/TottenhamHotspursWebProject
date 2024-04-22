package com.zakprojects.webApp.repository;

import com.zakprojects.webApp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {

    void deleteEmployeeById(Long id); //Spring understands this method without even writing it

    Optional<Employee> findEmployeeById(Long id);  // Same for this method
}

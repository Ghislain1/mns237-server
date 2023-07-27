package org.mns237.dao;

import java.util.Optional;

import org.mns237.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    void deleteEmployeeById(Long id);

    Optional <Employee> findEmployeeById(Long id);

    Optional<Employee> findEmployeeByEmail(String email);

    
    
}

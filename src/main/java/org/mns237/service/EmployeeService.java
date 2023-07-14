package org.mns237.service;

import java.util.List;
import java.util.UUID;

import org.mns237.dao.EmployeeRepository;
import org.mns237.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    // adding an employee
    public Employee addEmployee(Employee employee){
        //this is to give random id to employeeCode 
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepository.save(employee);
    }

    //publish list of Employee
    public List<Employee> findAllEmployee(){
        return employeeRepository.findAll();
    }

    //update Employee
    public Employee updateEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    //delete an Employee
    public void deleteEmployee(Long id){
        employeeRepository.deleteEmployeeById(id);
    }

    // find employee by Id
    public Employee findEmployeeById(Long id){
        return employeeRepository.findEmployeeById(id).orElseThrow(() -> new UserNotFoundException("user by id " + id + " was not found"));
    }

}

package com.nisum;

import java.util.HashSet;
import java.util.Set;

public class Department {
    String deptName;
    Set<String> employees;

    Set<Employee> employeeSet;

    public Department(String deptName) {
        this.deptName = deptName;
        this.employees = new HashSet<>();
        this.employeeSet = new HashSet<>();
    }

    public void add(String employee){
        this.employees.add(employee);
    }
    public void addEmployee(Employee employee){
        this.employeeSet.add(employee);
    }

    public Set<String> getEmployees() {
        return employees;
    }

    public Set<Employee> getEmployeeSet() {
        return employeeSet;
    }
}

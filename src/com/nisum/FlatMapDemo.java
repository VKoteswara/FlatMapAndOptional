package com.nisum;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlatMapDemo {
    public static void main(String[] args) {
        List<Department> listOfDept = new ArrayList<>();
        //Created the manager department and added the employees
        Department managerDept = new Department("Manager");
        Employee amar = new Employee("Amar", 30000.00);
        managerDept.addEmployee(amar);
        managerDept.addEmployee(new Employee("Balu",20000.00));
        managerDept.addEmployee(new Employee("Mulari",35000.00));
        managerDept.addEmployee(new Employee("Prasad",30000.00));

        //Created the devloper department and added the employees
        Department devloperDept = new Department("Devloper");
        devloperDept.addEmployee(new Employee("Chingeevi",20000.00));
        devloperDept.addEmployee(new Employee("Krishna",25000.00));
        devloperDept.addEmployee(amar);

        // Added the departments to listOfDept
        listOfDept.add(managerDept);
        listOfDept.add(devloperDept);

        // to get aggregate  prior to java 8
        List<Employee> listOfEmployees= new ArrayList<>();
        for (Department dep: listOfDept){
            for (Employee employee: dep.getEmployeeSet()){
                listOfEmployees.add(employee);
            }
        }
        System.out.println(listOfEmployees);

        // to get unique set prior to java
        Set<Employee>   setOfEmployees = new HashSet<>();
        for (Department dep: listOfDept){
            for (Employee employee: dep.getEmployeeSet()){
                setOfEmployees.add(employee);
            }
        }

        System.out.println(setOfEmployees);

        //to get aggregate in java 8
        List<Employee> employeeList = listOfDept.stream()
                                                .flatMap(employee -> employee.getEmployeeSet().stream())
                                                .collect(Collectors.toList());
        System.out.println(employeeList);

        //to get unique set   in java 8
        Set<Employee>  employeeSet = listOfDept.stream()
                                                .flatMap(employee -> employee.getEmployeeSet().stream())
                                                .collect(Collectors.toSet());
        System.out.println(employeeSet);
    }
}

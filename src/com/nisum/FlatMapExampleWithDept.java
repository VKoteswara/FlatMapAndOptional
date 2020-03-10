package com.nisum;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlatMapExampleWithDept {
    public static void main(String[] args) {
        List<Department> listOfDept = new ArrayList<>();

        Department managerDept = new Department("Manager");
        managerDept.add("Amar");
        managerDept.add("Balu");
        managerDept.add("Krishna");
        managerDept.add("Murali");

        Department devloperDept = new Department("Devloper");
        devloperDept.add("prasad");
        devloperDept.add("Venkata");
        devloperDept.add("Murali");

        listOfDept.add(managerDept);
        listOfDept.add(devloperDept);



        // to get aggregate
        List<String> employesList = listOfDept.stream()
                                                .flatMap(element -> element.getEmployees().stream())
                                                .collect(Collectors.toList());
        System.out.println(employesList);
        // to get unique set
        Set<String> employeeSet = listOfDept.stream()
                                                .flatMap(element -> element.getEmployees().stream())
                                                .collect(Collectors.toSet());
        System.out.println(employeeSet);


    }
}

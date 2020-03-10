package com.nisum;

public class Employee {

    String empName;
    Double salary;

    public Employee(String empName, Double salary) {
        this.empName = empName;
        this.salary = salary;
    }

    public String getEmpName() {
        return empName;
    }

    public Double getSalary() {
        return salary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", salary=" + salary +
                '}';
    }
}

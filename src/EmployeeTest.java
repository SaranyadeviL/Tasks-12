package com.example.hrtest;

import com.example.hr.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        //create an instance of Employee
        Employee employee = new Employee("john", 1254, 90000.00);

        //call methods to print the employee salary and name
        employee.printName();
        employee.printSalary();
    }
}

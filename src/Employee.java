package com.example.hr;

public class Employee {
    //fields
    private String name;
    private int id;
    private double salary;

    //constructor
    public Employee(String name, int id, double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;

    }

    //method to print the employees name
    public void printName(){
        System.out.println("Employee Name :" + name);
    }

    //method to print the employees salary
    public void printSalary(){
        System.out.println("Employee Salary :" +salary);
    }
    //getters and setters
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }

}

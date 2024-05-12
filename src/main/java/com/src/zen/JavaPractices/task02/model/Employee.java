package com.src.zen.JavaPractices.task02.model;

public class Employee extends Person {

    private int employeeID;

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private double salary;
    public Employee(String name, int age, int employeeID, double salary){
        super(name,age);
        this.employeeID=employeeID;
        this.salary=salary;
    }
}

package com.src.zen.JavaPractices.task03;

public class Employee implements Taxable{

    private String empId;
    private String name;
    private double salary;

    public Employee(String empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public void calcTax(){
        double incomeTax=this.salary*INCOME_TAX;
        System.out.println("Income Tax for "+this.name+" is Rs."+incomeTax);
    }
}

package com.src.zen.JavaPractices.task02;

import com.src.zen.JavaPractices.task02.model.Employee;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee=new Employee("Ashiq",28,2930,35000);
        System.out.println("Name "+employee.getName());
        System.out.println("Age "+employee.getAge());
        System.out.println("Emploee ID "+ employee.getEmployeeID());
        System.out.println("Salar : "+employee.getSalary());
    }
}

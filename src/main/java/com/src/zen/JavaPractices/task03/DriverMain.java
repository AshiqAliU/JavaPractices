package com.src.zen.JavaPractices.task03;

import java.util.Scanner;

public class DriverMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Employee
        System.out.println("Enter Employee ID, Name, and Yearly Salary:");
        String empId = scanner.nextLine();
        String name = scanner.nextLine();
        double salary = scanner.nextDouble();
        Employee employee = new Employee(empId, name, salary);

        // Input for Product
        System.out.println("Enter Product ID, Price per unit, and Quantity:");
        scanner.nextLine(); // Flush the newline
        String pid = scanner.nextLine();
        double price = scanner.nextDouble();
        int quantity = scanner.nextInt();
        Product product = new Product(pid, price, quantity);

        // Calculate taxes
        employee.calcTax();
        product.calcTax();

        scanner.close();
    }
}


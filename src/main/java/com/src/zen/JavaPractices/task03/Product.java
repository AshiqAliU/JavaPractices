package com.src.zen.JavaPractices.task03;

public class Product  implements Taxable {
    private String pid;
    private double price;
    private int quantity;

    public Product(String pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    public void calcTax() {
        double salesTax = this.price * this.quantity * SALES_TAX;
        System.out.println("Sales Tax for product " + this.pid + " is $" + salesTax);
    }
}

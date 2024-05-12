package com.src.zen.JavaPractices.task01;

import java.util.Scanner;

public class PurchaseDisc {

    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);

        System.out.print("Enter the purchase amount :");
        int amount=obj.nextInt();

        if(amount<500)
            System.out.println("No discount applied");
        else if(amount>500 && amount <1000)
            System.out.println("10% discount applied");
        else if(amount>1000)
            System.out.println("20% discount applied");
    }
}

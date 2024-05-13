package com.src.zen.JavaPractices.task01;

import java.util.Scanner;

public class NumberFinder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the values :");
        int values = scan.nextInt();
        if (values >= 0)
            System.out.println(values + " Positive");
        else
            System.out.println(values + " Negatives");

    }
}

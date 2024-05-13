package com.src.zen.JavaPractices.task01;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ":");
            numbers[i] = scanner.nextInt();
        }


        int smallest = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        System.out.println("The smallest number is :" + smallest);
    }
}

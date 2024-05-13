package com.src.zen.JavaPractices.task04;

import java.util.Scanner;

public class Weekdays {
    public static void main(String[] args) {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day index (0-6):");
        try {
            int index = scanner.nextInt();
            System.out.println("Day of the week: " + days[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index, should be between 0 and 6.");
        }
    }
}

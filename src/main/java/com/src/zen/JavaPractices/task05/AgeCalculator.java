package com.src.zen.JavaPractices.task05;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your birthdate (yyyy-mm-dd): ");
        String input = scanner.nextLine();
        LocalDate birthDate = LocalDate.parse(input);
        LocalDate currentDate = LocalDate.now();

        Period period = Period.between(birthDate, currentDate);
        System.out.printf("Your age is: %d years, %d months, and %d days.\n",
                period.getYears(), period.getMonths(), period.getDays());
        scanner.close();
    }
}

package com.src.zen.JavaPractices.task01;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the numbers to Reverse :");
        String values=obj.next();
        StringBuilder builder=new StringBuilder();
        for(int i=values.length()-1; i>=0; i--){
            builder.append(values.charAt(i));
        }
        System.out.println("Reversed values  : "+builder.toString());
    }
}

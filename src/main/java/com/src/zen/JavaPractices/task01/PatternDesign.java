package com.src.zen.JavaPractices.task01;

public class PatternDesign {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int num = n - i;
                if (j < i) {
                    num = n - j;
                }
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

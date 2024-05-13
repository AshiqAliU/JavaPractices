package com.src.zen.JavaPractices.task04;

import com.src.zen.JavaPractices.task04.exception.AgeNotWithinRangeException;
import com.src.zen.JavaPractices.task04.exception.NameNotValidException;

public class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        this.rollNo = rollNo;
        if (!name.matches("[a-zA-Z\\s]+")) {
            throw new NameNotValidException("Name contains invalid characters.");
        }
        this.name = name;
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age is not within the acceptable range (15-21).");
        }
        this.age = age;
        this.course = course;
    }

    public static void main(String[] args) {
        try {
            Student student = new Student(23, "Dipin", 19, "Ph D");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

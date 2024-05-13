package com.src.zen.JavaPractices.task04;

import com.src.zen.JavaPractices.task04.exception.InvalidAgeException;

public class Voter {
    private String voterId;
    private String name;
    private int age;

    public Voter(String voterId, String name, int age) throws InvalidAgeException {
        this.voterId = voterId;
        this.name = name;
        if (age < 18) {
            throw new InvalidAgeException("Invalid age for voter");
        }
        this.age = age;
    }

    public static void main(String[] args) {
        try {
            Voter voter=new Voter("292","Dipin",17);
        } catch (InvalidAgeException e) {
            e.printStackTrace();
        }
    }

}

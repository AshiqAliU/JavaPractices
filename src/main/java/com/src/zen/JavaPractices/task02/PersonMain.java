package com.src.zen.JavaPractices.task02;

import com.src.zen.JavaPractices.task02.model.Person;

public class PersonMain {
    public static void main(String[] args) {
        Person person=new Person("Ashiq",29);
        System.out.println("Name :"+person.getName());
        System.out.println("Age  :"+person.getAge());

        Person person1=new Person("Dipin");
        System.out.println("Name :"+person1.getName());
        System.out.println("Age  :"+person1.getAge());
    }
}

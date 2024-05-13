package com.src.zen.JavaPractices.task04;

import java.util.HashMap;

public class GradeManager {
    private HashMap<String, Integer> grades;

    public GradeManager() {
        grades = new HashMap<>();
    }

    public void addStudent(String name, int grade) {
        grades.put(name, grade);
    }

    public void removeStudent(String name) {
        grades.remove(name);
    }

    public Integer getGrade(String name) {
        return grades.get(name);
    }

    public void displayGrade(){
        grades.forEach((key,value) -> System.out.println(key +" "+grades.get(key)));
    }

    public static void main(String[] args) {
        GradeManager gradeManager=new GradeManager();
        gradeManager.addStudent("Dipin",1);
        gradeManager.addStudent("Ashiq",2);
        gradeManager.addStudent("Pradeep",3);
        System.out.println("****************");
        gradeManager.displayGrade();
        System.out.println("****************");

        System.out.println("Grade of Ashiq : "+gradeManager.getGrade("Ashiq"));
        gradeManager.removeStudent("Pradeep");
        System.out.println("****************After Removing");

        gradeManager.displayGrade();


    }
}

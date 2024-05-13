package com.src.zen.JavaPractices.task05;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStudents {
    public static void main(String[] args) {
        List<String> studentNames = Arrays.asList("Alice", "Bob", "Andrew", "Amanda", "Arnold", "Beth", "Carl", "Diana", "Aaron", "Doris");
        List<String> filteredNames = studentNames.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println("Students whose names start with 'A': " + filteredNames);
    }
}

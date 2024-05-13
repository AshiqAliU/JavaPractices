package com.src.zen.JavaPractices.task05;

import java.util.Arrays;
import java.util.List;

public class CheckEmptyStrings {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "", "jkl");
        boolean hasEmpty = strings.stream().anyMatch(String::isEmpty);
        System.out.println("List has empty strings: " + hasEmpty);
    }
}

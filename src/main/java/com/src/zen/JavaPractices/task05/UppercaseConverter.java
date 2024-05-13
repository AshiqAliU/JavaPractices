package com.src.zen.JavaPractices.task05;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UppercaseConverter {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("aBc", "d", "ef");
        List<String> upperCaseStrings = strings.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(upperCaseStrings);
    }
}

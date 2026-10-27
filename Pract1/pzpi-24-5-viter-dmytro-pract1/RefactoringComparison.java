package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RefactoringComparison {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 12, 18, 3, 22, 9, 30);

        // Після рефакторингу (декларативний Stream API)
        List<Integer> newResult = numbers.stream()
                .filter(n -> n != null && n > 10)
                .map(n -> n * 2)
                .filter(processed -> processed < 50)
                .collect(Collectors.toList());

        System.out.println("Результат: " + newResult);
    }
}
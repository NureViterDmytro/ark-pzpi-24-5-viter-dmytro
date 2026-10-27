package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RefactoringBefore {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 12, 18, 3, 22, 9, 30);

        // До рефакторингу (громіздкий цикл зі складними умовами)
        List<Integer> oldResult = new ArrayList<>();
        for (Integer number : numbers) {
            if (number != null) {
                if (number > 10) {
                    int processed = number * 2;
                    if (processed < 50) {
                        oldResult.add(processed);
                    }
                }
            }
        }
    }
}
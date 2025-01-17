package com.mycompany.app;

public class App {
    public static void main(String[] args) {
        // Hardcoded value
        int hardcodedValue = 42;

        // Unused variable
        int unusedVariable = 100;

        // Potential NullPointerException
        String potentiallyNullString = null;
        System.out.println(potentiallyNullString.length());

        // Inefficient loop
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("i: " + i + ", j: " + j);
            }
        }

        // Duplicate code
        if (hardcodedValue == 42) {
            System.out.println("The answer to life, the universe, and everything.");
        }
        if (hardcodedValue == 42) {
            System.out.println("The answer to life, the universe, and everything.");
        }
    }
}


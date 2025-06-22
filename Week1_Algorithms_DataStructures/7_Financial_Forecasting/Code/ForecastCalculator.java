package com.forecase.example;

public class ForecastCalculator {

    // Recursive method to calculate future value
    public static double predictValueRecursive(double initialValue, double growthRate, int years) {
        if (years == 0) return initialValue;
        return predictValueRecursive(initialValue * (1 + growthRate), growthRate, years - 1);
    }

    // Optimized version using iteration to avoid stack overflow
    public static double predictValueIterative(double initialValue, double growthRate, int years) {
        double value = initialValue;
        for (int i = 0; i < years; i++) {
            value *= (1 + growthRate);
        }
        return value;
    }
}

package com.forecase.example;

public class ForecastTest {
    public static void main(String[] args) {
        double initialAmount = 10000; // Rs. 10,000
        double annualGrowthRate = 0.08; // 8% growth
        int years = 5;

        System.out.println("Using Recursive Method:");
        double recursiveResult = ForecastCalculator.predictValueRecursive(initialAmount, annualGrowthRate, years);
        System.out.printf("Value after %d years: %.2f%n", years, recursiveResult);

        System.out.println("\nUsing Iterative Method (Optimized):");
        double iterativeResult = ForecastCalculator.predictValueIterative(initialAmount, annualGrowthRate, years);
        System.out.printf("Value after %d years: %.2f%n", years, iterativeResult);
    }
}

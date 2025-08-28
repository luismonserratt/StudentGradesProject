Written by ..: Luis Augusto Monserratt Alvarado
Date Written.: Fall 2024                                                                              ==
Purpose......: Demonstrate the input () function


import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constants
        final int CALORIES_PER_BEER = 150;
        final double POUNDS_PER_BEER = 15.0 / (365 * 1.0); // 15 pounds per year from daily consumption

        // User Input
        System.out.print("On average, how many beers will you consume each day? ");
        double beersPerDay = scanner.nextDouble();
        System.out.print("On average, how much will you pay for each can of beer? ");
        double costPerBeer = scanner.nextDouble();

        // Calculations
        int daysInYear = 365;
        double totalBeers = beersPerDay * daysInYear;
        double totalCalories = totalBeers * CALORIES_PER_BEER;
        double totalWeightGain = (totalBeers / 365) * POUNDS_PER_BEER; // Correct calculation of weight gain
        double totalCost = totalBeers * costPerBeer;

        // Output
        System.out.printf("That is approximately %.2f beers in one year.%n", totalBeers);
        System.out.printf("In one year, you will consume approximately %.2f calories from beer alone.%n", totalCalories);
        System.out.printf("Without diet or exercise to counter these calories, you can expect to gain %.2f pounds from drinking that much beer this year.%n", totalWeightGain);
        System.out.printf("You will spend approximately $%.2f on beer this year.%n", totalCost);

        scanner.close();
    }
}

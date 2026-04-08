package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for employee name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Prompt for hours worked
        System.out.print("Enter hours worked: ");
        double hoursWorked = scanner.nextDouble();

        // Prompt for pay rate
        System.out.print("Enter your pay rate: ");
        double payRate = scanner.nextDouble();

        // Calculate gross pay
        double grossPay = hoursWorked * payRate;

        // Display results
        System.out.println("\nEmployee Name: " + name);
        System.out.printf("Gross Pay: $%.2f%n", grossPay);

        scanner.close();
    }
}

package com.ps;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(
                "Which calculator would you like to use?\n\n" +
                        "If Mortgage Calculator, type 1\n" +
                        "If Future Value Calculator, type 2\n" +
                        "If Present Value Calculator, type 3\n"
        );
        System.out.println("Enter here: ");
        String selection = scanner.nextLine();
        System.out.println();

        switch (selection) {
            // Mortgage Calculator
            case "1":
                ifMortgage();
                break;
            // Future Value Calculator
            case "2":
                ifFV();
                break;
            // Present Value Calculator
            case "3":
                ifPV();
                break;
            default:
                System.out.println("ERROR: Type either 1, 2, or 3.");
                break;
        }

        scanner.close();
    }

    // Generates user interface, runs mortgage calculator, and prints mortgage calculator statement.
    public static void ifMortgage() {
        float principal = 0;
        float interestRate = 0;
        int loanDuration = 0;

        System.out.println("You selected the 'Mortgage Calculator'");
        System.out.print("What is your Principal amount? ");
        principal = scanner.nextFloat();
        System.out.println();
        System.out.print("What is the monthly interest rate in %? ");
        interestRate = scanner.nextFloat();
        System.out.println();
        System.out.print("What is the loan length in years? ");
        loanDuration = scanner.nextInt();
        System.out.println();

        System.out.println(Calculators.mortgageCalculator(principal, interestRate, loanDuration));
    }

    // Generates user interface, runs future value calculator, and prints future value calculator statement.
    public static void ifFV() {
        float principal = 0;
        float interestRate = 0;
        int numOfYears = 0;

        System.out.println("You selected the 'Future Value Calculator'");
        System.out.print("What is your CD's deposit amount? ");
        principal = scanner.nextFloat();
        System.out.println();
        System.out.print("What is the interest rate in %? ");
        interestRate = scanner.nextFloat();
        System.out.println();
        System.out.print("How many years will it take for your CD to mature? ");
        numOfYears = scanner.nextInt();
        System.out.println();

        System.out.println(Calculators.fVCalculator(principal, interestRate, numOfYears));
    }

    // Generates user interface, runs present value calculator, and prints present value calculator statement.
    public static void ifPV() {
        float monthlyPayout = 0;
        float interestRate = 0;
        int numOfYears = 0;

        System.out.println("You selected the 'Present Value Calculator'");
        System.out.print("What is your monthly payout amount? ");
        monthlyPayout = scanner.nextFloat();
        System.out.println();
        System.out.print("What is the interest rate in %? ");
        interestRate = scanner.nextFloat();
        System.out.println();
        System.out.print("How many years will you have to pay out? ");
        numOfYears = scanner.nextInt();
        System.out.println();

        System.out.println(Calculators.pVCalculator(monthlyPayout, interestRate, numOfYears));
    }
}
package com.ps;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        float principal = 0; // Used in Mortgage and Future Value Calculator
        float interestRate = 0; // Used in all calculator methods
        float monthlyPayout = 0; // Used in Present Value Calculator

        int loanDuration = 0; // Used in Mortgage Calculator
        int numOfYears = 0; // Used in Future Value Calculator and Present Value Calculator

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
                break;
            // Future Value Calculator
            case "2":
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
                break;
            // Present Value Calculator
            case "3":
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
                break;
            default:
                System.out.println("ERROR: Type either 1, 2, or 3.");
                break;
        }

        scanner.close();
    }
}
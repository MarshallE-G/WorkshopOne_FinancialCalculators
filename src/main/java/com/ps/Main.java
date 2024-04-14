package com.ps;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        float principal = 0;
        float interestRate = 0;

        int loanDuration = 0; // From Mortgage Calculator
        int numOfYears = 0; // From Future Value Calculator

        System.out.println(
                "Which calculator would you like to use?\n\n" +
                        "If Mortgage Calculator, type 1\n" +
                        "If Future Value Calculator, type 2\n"
        );
        System.out.println("Enter here: ");
        String selection = scanner.nextLine();
        System.out.println();

        switch (selection) {
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
            default:
                System.out.println("ERROR: Type either 1 or 2.");
                break;
        }

        scanner.close();
    }
}
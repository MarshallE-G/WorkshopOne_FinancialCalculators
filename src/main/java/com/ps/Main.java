package com.ps;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        float principal = 0;
        float interestRate = 0;
        int loanDuration = 0;

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

        scanner.close();
    }
}
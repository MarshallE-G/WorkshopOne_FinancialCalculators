package com.ps;

public class MortgageCalculator extends Main {

    // Create static method
        // Find out principal amount from user
        // Find interest rate from user
        // Find loan length/duration from user
        // Create compounding interest formula for monthly loan amount
        // Find interest amount for loan duration
        // Return a sentence stating monthly loan amount and interest for loan duration
    public static float mortgageCalculator(float principal, float interestRate, float loanDuration) {
        System.out.print("What is your Principal amount? ");
        principal = scanner.nextFloat();
        System.out.println();
        System.out.print("What is the monthly interest rate? ");
        interestRate = scanner.nextFloat();
        System.out.println();
        System.out.print("What is the loan length? ");
        loanDuration = scanner.nextFloat();
        System.out.println();

        float monthlyLoanAmount = (principal * (interestRate/12)) * Math.pow((1 + (loanDuration)), );


        return 0;
    }

}

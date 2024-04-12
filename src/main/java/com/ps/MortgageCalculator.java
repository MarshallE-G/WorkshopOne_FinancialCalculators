package com.ps;

public class MortgageCalculator extends Main {

    // Create static method
        // Find out principal amount from user
        // Find interest rate from user
        // Find loan length/duration from user
        // Create compounding interest formula for monthly loan amount
        // Find interest amount for loan duration
        // Return a sentence stating monthly loan amount and interest for loan duration
    public static String mortgageCalculator(float principal, float interestRate, int loanDuration) {
        System.out.print("What is your Principal amount? ");
        principal = scanner.nextFloat();
        System.out.println();
        System.out.print("What is the monthly interest rate? ");
        interestRate = scanner.nextFloat();
        System.out.println();
        System.out.print("What is the loan length? ");
        loanDuration = scanner.nextInt();
        System.out.println();

        float monthlyLoanAmount = (float) (principal * Math.pow((1 + (interestRate/12)), (12*loanDuration)));
        float totalInterest = (monthlyLoanAmount * (12*loanDuration)) - principal;
        /* A $53,000 loan at 7.625% interest for 15 years would have a $495.09/mo payment with a total interest
         * of $36,115.99
         */
        String theExpectedMonthlyPaymentAndTotalInterestPaid =
                "A $" + String.format("%.2f", principal) + " loan at " + String.format("%.2f", interestRate)
                        + "% interest for " + loanDuration + " years would have a $"
                        + String.format("%.2f", monthlyLoanAmount) + "/mo payment with a total interest of $"
                        + String.format("%.2f", totalInterest) + ".\n";

        return theExpectedMonthlyPaymentAndTotalInterestPaid;
    }

}

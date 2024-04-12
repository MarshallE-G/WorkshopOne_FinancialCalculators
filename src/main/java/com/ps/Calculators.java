package com.ps;

public class Calculators extends Main {

    // Create static method
        // Find out principal amount from user
        // Find interest rate from user
        // Find loan length/duration from user
        // Create compounding interest formula for monthly loan amount
        // Find interest amount for loan duration
        // Return a sentence stating monthly loan amount and interest for loan duration
    public static String mortgageCalculator(float principal, float interestRate, int loanDuration) {
        float monthlyInterestRateInDecimals = (interestRate/100) / 12;
        int timeInMonths = 12 * loanDuration;

        float monthlyLoanPayment = (float) (principal * (monthlyInterestRateInDecimals *
                Math.pow((1 + monthlyInterestRateInDecimals), timeInMonths)) /
                (Math.pow((1 + monthlyInterestRateInDecimals), timeInMonths) - 1));

        float totalInterest = (monthlyLoanPayment * (12*loanDuration)) - principal;
        /* A $53,000 loan at 7.625% interest for 15 years would have a $495.09/mo payment with a total interest
         * of $36,115.99
         */
        String theExpectedMonthlyPaymentAndTotalInterestPaid =
                "A $" + String.format("%.2f", principal) + " loan at " + String.format("%.3f", interestRate)
                        + "% interest for " + loanDuration + " years would have a $"
                        + String.format("%.2f", monthlyLoanPayment) + "/mo payment with a total interest of $"
                        + String.format("%.2f", totalInterest) + ".\n";

        return theExpectedMonthlyPaymentAndTotalInterestPaid;
    }

}
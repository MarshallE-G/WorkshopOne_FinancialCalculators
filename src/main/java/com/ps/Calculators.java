package com.ps;

public class Calculators extends Main {

    // A calculator that determines how much a monthly payment for a loan would be and the total interest.
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
        /* Ex.) A $53,000 loan at 7.625% interest for 15 years would have a $495.09/mo payment with a total interest
         * of $36,115.99
         */
        String theExpectedMonthlyPaymentAndTotalInterestPaid =
                "A $" + String.format("%.2f", principal) + " loan at " + interestRate
                        + "% interest for " + loanDuration + " years would have a $"
                        + String.format("%.2f", monthlyLoanPayment) + "/mo payment with a total interest of $"
                        + String.format("%.2f", totalInterest) + ".";

        return theExpectedMonthlyPaymentAndTotalInterestPaid;
    }

    // A calculator that determines the future value of a one-time deposit to a CD (Certificate of Deposit)
    public static String fVCalculator(float principal, float interestRate, int numOfYears) {

        float dailyInterestRateInDecimals = (interestRate/100) / 365;
        int timeInDays = 365 * numOfYears;

        float endBalance = (float) (principal * Math.pow((1 + dailyInterestRateInDecimals), timeInDays));
        float interestAccrued = endBalance - principal;
        /* Ex.) If you deposit $1,000 in a CD that earns 1.75% interest and matures in 5 years, your CD's ending
         * balance will be $1,092.62 and you would have earned $92.62 in interest.
         */

        String endingBalanceAndInterest =
                "If you deposit $" + String.format("%.2f", principal) + " in a CD that earns "
                        + String.format("%.2f", interestRate) + "% interest and matures in " + numOfYears
                        + " years, your CD's ending balance will be $" + String.format("%.2f", endBalance)
                        + " and you would have earned $" + String.format("%.2f", interestAccrued)
                        + " in interest.";

        return endingBalanceAndInterest;
    }

    // A calculator that determines the present value of an ordinary annuity.
    public static String pVCalculator(float monthlyPayout, float interestRate, int numOfYears) {

        float monthlyInterestRateInDecimals = (interestRate/100) / 12;
        int numOfPayments = 12 * numOfYears;

        float presentValue = (float) (monthlyPayout * ((1 - Math.pow((1 + monthlyInterestRateInDecimals), (-numOfPayments)))
                / monthlyInterestRateInDecimals));
        /* There's a rounding issue above.
         * The result of "Math.pow((1 + monthlyInterestRateInDecimals), (-numOfPayments))" is off after the 4th decimal place.
         * --> results in a larger larger decimal. Causes present value to be a bit off.
         */

        /* Ex.) To fund an annuity that pays $3,000 monthly for 20 years and earns an expected 2.5% interest, you would
         * need to invest $566,141.46 today.
         */
        String pVResult =
                "To fund an annuity that pays $"+ String.format("%.2f", monthlyPayout) + " monthly for "
                        + numOfYears + " years and earns an expected " + interestRate
                        + "% interest, you would need to invest $" + String.format("%.2f", presentValue) + " today.";

        return pVResult;
    }

}

# Workshop 1: Financial Calculators
- For this project, I created a set of 3 financial calculators (a mortgage, future value, and present value calculator) and an interface that prompts the user to choose which calculator they would like to use.

## Screenshots of my code:
### My Home Screen
![HomeScreen1](https://github.com/MarshallE-G/WorkshopOne_FinancialCalculators/assets/166543327/01ff6ddc-8282-436d-8f3c-11aa13ec93d8)
![HomeScreen2](https://github.com/MarshallE-G/WorkshopOne_FinancialCalculators/assets/166543327/b205535d-cdfd-460d-9069-4084f17b434a)

### Mortgage Calculator
![MortgageCalculator1](https://github.com/MarshallE-G/WorkshopOne_FinancialCalculators/assets/166543327/acd66b84-ef0f-464a-84e0-bacbca15e4a8)
![MortgageCalculator2](https://github.com/MarshallE-G/WorkshopOne_FinancialCalculators/assets/166543327/5e60b224-fb92-4316-91a7-bf6b17ca8906)

### Future Value Calculator
![FutureValueCalculator1](https://github.com/MarshallE-G/WorkshopOne_FinancialCalculators/assets/166543327/7478e6a7-b23e-40f2-834b-f633960b1673)
![FutureValueCalculator2](https://github.com/MarshallE-G/WorkshopOne_FinancialCalculators/assets/166543327/c10ca28d-8635-45f9-b2ed-199a37b06591)

### Present Value Calculator
![PresentValueCalculator1](https://github.com/MarshallE-G/WorkshopOne_FinancialCalculators/assets/166543327/1e25a62c-3da0-4cb4-a390-ab6254517e60)
![PresentValueCalculator2](https://github.com/MarshallE-G/WorkshopOne_FinancialCalculators/assets/166543327/d3718e40-5d3d-444e-8305-2b2de96614c1)

### A calculator with erroneous inputs and error message
![CalculatorErrorMessage1](https://github.com/MarshallE-G/WorkshopOne_FinancialCalculators/assets/166543327/fae6806f-fa1f-4d04-a6b2-dc4725771707)
![CalculatorErrorMessageV2_1](https://github.com/MarshallE-G/WorkshopOne_FinancialCalculators/assets/166543327/5069d96b-e4a4-4729-8043-17fa0c67b65b)

## Interesting Code
- One interesting piece of code was:

      // Math.pow((1 + monthlyInterestRateInDecimals), (-numOfPayments))

  - Why? Because even though the formula is accurate, whether you returned the result as a float or a double, it'll be off/differ from the correct number by a certain number of decimals.

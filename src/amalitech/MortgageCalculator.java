package amalitech;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Building A Mortgage Calculator
 * Requirement Specs:
 * 1. Principal:100000
 * 2.Annual Interest Rates:4.2
 * 3. Period(Years):30
 * 4. Mortgage:$?
 * 5.
 */

public class MortgageCalculator {

    /**
     * Now It’s time for a small project:
     * Use what you’ve learned in the section and build a mortgage calculator
     * When we run this program we get fews questions:
     * Principal – Amount Of Loan We want to get – $ 100000
     * Annual Interest Rate: 3.92 will be devided by 100 then /12
     * Period(Years)- 30 to be * 12 – number of payments
     * Add Error Handling!!
     * */
    public static void main(String...args) {
        // get principal

        double prinicpal;
        do {
            System.out.println("Please enter Principal, between 1,000 and 1,000,000, or 0 to exit: ");
            prinicpal = getInput();
        } while (prinicpal < 1000 || prinicpal>1_000_000);

        //get interest rate
        double rate;
        do {
            System.out.println("Please enter Annual Interest Rate, or 0 to exit: ");
            rate = getInput();
            rate/=100;
        }
        while (rate < 0);

        // get number of years
        double years;
        do {
            System.out.println("Please enter the number of years greater than 1, or 0 to exit: ");
            years = getInput();
            years *= 12;
        }
        while (years < 1);
        String mortgage = calculateMortgage(prinicpal, rate, years);
        System.out.println("Mortgage calculated is: " + mortgage);
    }

    public static Double getInput() {
        Scanner scanner=new Scanner(System.in);
        double input;
        if(scanner.hasNextFloat()) {
            input =  scanner.nextFloat();
            if (input == 0) {
                scanner.close();
                System.exit(0);
            }
            return input;
        } else {
            System.out.println("Please enter a valid figure: ");
            return getInput();
        }
    }
    public static String calculateMortgage(double principal, double rate, double months){
        double mortgage = principal * (1+ rate) /months;
        return NumberFormat.getCurrencyInstance().format(mortgage);
    }
}

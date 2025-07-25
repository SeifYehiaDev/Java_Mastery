/*
 * Author: Seif Yehia
 * Socials: SeifYehiaDev (Facebook, LinkedIn, Instagram, GitHub)
 * Created: 25/07/2025
 */

package Chapter_02_Lists;

import java.util.Scanner;

public class Listing_02_09_ComputeLoan_V1 {
    public static void main(String[] args) {
        int numberOfYears;
        double interestRate, loanAmount, monthlyInterestRate, monthlyPayment, totalPayment;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter annual interest rate, e.g., 5.75%: ");
        interestRate = input.nextDouble();
        System.out.print("Enter number of years as an integer, e.g., 5: ");
        numberOfYears = input.nextInt();
        System.out.print("Enter loan amount, e.g., 120000.95: ");
        loanAmount = input.nextDouble();
        monthlyInterestRate = interestRate / (1200.0);
        monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1.0 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
        totalPayment = monthlyPayment * numberOfYears * 12;
        System.out.printf("""
                The monthly payment is $%.2f
                The total payment is $%.2f""", monthlyPayment, totalPayment);
    }
}

//                                                 _Output_
/*
Enter annual interest rate, e.g., 5.75%: 5.75
Enter number of years as an integer, e.g., 5: 15
Enter loan amount, e.g., 120000.95: 250000
The monthly payment is $2076.03
The total payment is $373684.54
 */
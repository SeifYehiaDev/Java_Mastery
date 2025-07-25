/*
 * Author: Seif Yehia
 * Socials: SeifYehiaDev (Facebook, LinkedIn, Instagram, GitHub)
 * Created: 25/07/2025
 */

package Chapter_02_Exercises;

import java.util.Scanner;

public class Exercise_02_21 {
    public static void main(String[] args) {
        int numberOfYears;
        double investmentAmount, annualInterestRate, monthlyInterestRate, futureInvestmentValue;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter investment amount: ");
        investmentAmount = input.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        annualInterestRate = input.nextDouble();
        System.out.print("Enter number of years: ");
        numberOfYears = input.nextInt();
        monthlyInterestRate = annualInterestRate / 1200.0;
        futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);
        System.out.printf("Accumulated value is $%.2f", futureInvestmentValue);
    }

}

//                                                 _Output_
/*
Enter investment amount: 1000.56
Enter annual interest rate in percentage: 4.25
Enter number of years: 1
Accumulated value is $1043.92
 */
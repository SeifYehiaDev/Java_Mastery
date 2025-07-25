/*
 * Author: Seif Yehia
 * Socials: SeifYehiaDev (Facebook, LinkedIn, Instagram, GitHub)
 * Created: 25/07/2025
 */

package Chapter_02_Exercises;

import java.util.Scanner;

public class Exercise_02_13 {
    public static void main(String[] args) {
        final int ANNUAL_INTEREST_RATE = 5, MONTHS = 6;
        double savingAmount, monthlyInterestRate, accountBalance = 0.0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: ");
        savingAmount = input.nextDouble();
        monthlyInterestRate = ANNUAL_INTEREST_RATE / 1200.0;
        for (int month = 1; month <= MONTHS; month++)
            accountBalance = (savingAmount + accountBalance) * (1 + monthlyInterestRate);
        System.out.printf("After the sixth month, the account value is $%.2f", accountBalance);
    }
}

//                                                 _Output_
/*
Enter the monthly saving amount: 100
After the sixth month, the account value is $608.81
 */
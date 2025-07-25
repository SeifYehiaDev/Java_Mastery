/*
 * Author: Seif Yehia
 * Socials: SeifYehiaDev (Facebook, LinkedIn, Instagram, GitHub)
 * Created: 25/07/2025
 */

package Chapter_02_Lists;

import java.util.Scanner;

public class Listing_02_10_ComputeChange {
    public static void main(String[] args) {
        double amount;
        int remainingAmount, numberOfOneDollars, numberOfQuarters, numberOfDimes, numberOfNickels, numberOfPennies;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount, for example, 11.56: ");
        amount = input.nextDouble();
        remainingAmount = (int) (amount * 100);
        numberOfOneDollars = remainingAmount / 100;
        remainingAmount %= 100;
        numberOfQuarters = remainingAmount / 25;
        remainingAmount %= 25;
        numberOfDimes = remainingAmount / 10;
        remainingAmount %= 10;
        numberOfNickels = remainingAmount / 5;
        remainingAmount %= 5;
        numberOfPennies = remainingAmount;
        System.out.printf("""
                Your amount %.2f consists of
                      %d dollars
                      %d quarters
                      %d dimes
                      %d nickels
                      %d pennies""", amount, numberOfOneDollars, numberOfQuarters, numberOfDimes, numberOfNickels, numberOfPennies);
    }
}

//                                                 _Output_
/*
Enter an amount, for example, 11.56: 11.56
Your amount 11.56 consists of
      11 dollars
      2 quarters
      0 dimes
      1 nickels
      1 pennies
 */
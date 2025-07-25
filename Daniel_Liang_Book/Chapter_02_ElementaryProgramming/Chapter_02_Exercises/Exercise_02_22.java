/*
 * Author: Seif Yehia
 * Socials: SeifYehiaDev (Facebook, LinkedIn, Instagram, GitHub)
 * Created: 25/07/2025
 */

package Chapter_02_Exercises;

import java.util.Scanner;

public class Exercise_02_22 {
    public static void main(String[] args) {
        int amount, numberOfDollars, numberOfQuarters, numberOfDimes, numberOfNickels, numberOfPennies;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount in double, for example 1156: ");
        amount = input.nextInt();
        numberOfDollars = amount / 100;
        numberOfQuarters = (amount % 100) / 25;
        numberOfDimes = (amount % 25) / 10;
        numberOfNickels = (amount % 10) / 5;
        numberOfPennies = amount % 5;
        System.out.printf("""
                Your amount %s consists of
                      %-2d dollars
                      %-2d quarters
                      %-2d dimes
                      %-2d nickels
                      %-2d pennies""", amount, numberOfDollars, numberOfQuarters, numberOfDimes, numberOfNickels, numberOfPennies);
    }
}

//                                                 _Output_
/*
Enter an amount in double, for example 1156: 1156
Your amount 1156 consists of
      11 dollars
      2  quarters
      0  dimes
      1  nickels
      1  pennies
 */
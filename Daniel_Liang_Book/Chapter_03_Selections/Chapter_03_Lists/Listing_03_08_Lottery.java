/*
 * Author: Seif Yehia
 * Socials: SeifYehiaDev (Facebook, LinkedIn, Instagram, GitHub)
 * Created: 20/08/2025
 */

package Chapter_03_Lists;

import java.util.Scanner;

public class Listing_03_08_Lottery {
    public static void main(String[] args) {
        int lottery = (int) (Math.random() * 100), guess;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (two digits): ");
        guess = input.nextInt();
        System.out.printf("The lottery number is %d\n", lottery);
        if (lottery == guess)
            System.out.println("Exact match: you win $10,000");
        else {
            int lotteryFirstDigit = lottery / 10, lotterySecondDigit = lottery % 10,
                    guessFirstDigit = guess / 10, guessSecondDigit = guess % 10;
            if (lotteryFirstDigit == guessSecondDigit && lotterySecondDigit == guessFirstDigit)
                System.out.println("Match all digits: you win $3,000");
            else if (lotteryFirstDigit == guessFirstDigit || lotteryFirstDigit == guessSecondDigit ||
                    lotterySecondDigit == guessFirstDigit || lotterySecondDigit == guessSecondDigit)
                System.out.println("Match one digit: you win $1,000");
            else
                System.out.println("Sorry, no match");
        }
    }
}

//                                                 _Output One_
/*
Enter your lottery pick (two digits): 39
The lottery number is 39
Exact match: you win $10,000
 */

//                                                 _Output Two_
/*
Enter your lottery pick (two digits): 65
The lottery number is 56
Match all digits: you win $3,000
 */

//                                                 _Output Three_
/*
Enter your lottery pick (two digits): 56
The lottery number is 85
Match one digit: you win $1,000
 */

//                                                 _Output Four_
/*
Enter your lottery pick (two digits): 04
The lottery number is 69
Sorry, no match
 */
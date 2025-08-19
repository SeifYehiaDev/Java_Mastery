/*
 * Author: Seif Yehia
 * Socials: SeifYehiaDev (Facebook, LinkedIn, Instagram, GitHub)
 * Created: 19/08/2025
 */

package Chapter_03_Lists;

import java.util.Scanner;

public class Listing_03_03_SubtractionQuiz_V1 {
    public static void main(String[] args) {
        int firstNumber = (int) (Math.random() * 10), secondNumber = (int) (Math.random() * 10), answer;
        Scanner input = new Scanner(System.in);
        if (secondNumber > firstNumber) {
            int temp = secondNumber;
            secondNumber = firstNumber;
            firstNumber = temp;
        }
        System.out.printf("What is %d - %d? ", firstNumber, secondNumber);
        answer = input.nextInt();
        if (answer == firstNumber - secondNumber)
            System.out.print("You are correct!");
        else
            System.out.printf("""
                    Your answer is wrong.
                    %d - %d should be %d""", firstNumber, secondNumber, (firstNumber - secondNumber));
    }
}

//                                                 _Output One_
/*
What is 3 - 1? 2
You are correct!
 */

//                                                 _Output Two_
/*
What is 7 - 1? 10
Your answer is wrong.
7 - 1 should be 6
 */
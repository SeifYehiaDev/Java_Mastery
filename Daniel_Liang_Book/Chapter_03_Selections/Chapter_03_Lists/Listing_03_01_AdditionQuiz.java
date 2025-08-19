/*
 * Author: Seif Yehia
 * Socials: SeifYehiaDev (Facebook, LinkedIn, Instagram, GitHub)
 * Created: 19/08/2025
 */

package Chapter_03_Lists;

import java.util.Scanner;

public class Listing_03_01_AdditionQuiz {
    public static void main(String[] args) {
        int firstNumber = (int) (Math.random() * 10), secondNumber = (int) (Math.random() * 10), answer;
        Scanner input = new Scanner(System.in);
        System.out.printf("What is %d + %d? ", firstNumber, secondNumber);
        answer = input.nextInt();
        System.out.printf("%d + %d = %d is %b", firstNumber, secondNumber, answer, (firstNumber + secondNumber) == answer);
    }
}

//                                                 _Output One_
/*
What is 0 + 6? 6
0 + 6 = 6 is true
 */

//                                                 _Output Two_
/*
What is 4 + 3? 4
4 + 3 = 4 is false
 */
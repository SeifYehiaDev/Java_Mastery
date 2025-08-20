/*
 * Author: Seif Yehia
 * Socials: SeifYehiaDev (Facebook, LinkedIn, Instagram, GitHub)
 * Created: 20/08/2025
 */

package Chapter_03_Exercises;

import java.util.Scanner;

public class Exercise_03_02_V1 {
    public static void main(String[] args) {
        int firstNumber = (int) (Math.random() * 10), secondNumber = (int) (Math.random() * 10),
                thirdNumber = (int) (Math.random() * 10), answer;
        Scanner input = new Scanner(System.in);
        System.out.printf("What is %d + %d + %d? ", firstNumber, secondNumber, thirdNumber);
        answer = input.nextInt();
        System.out.printf("%d + %d + %d = %d is %b", firstNumber, secondNumber, thirdNumber,
                answer, (firstNumber + secondNumber + thirdNumber) == answer);
    }
}

//                                                 _Output One_
/*
What is 7 + 6 + 5? 18
7 + 6 + 5 = 18 is true
 */

//                                                 _Output Two_
/*
What is 8 + 7 + 2? 8
8 + 7 + 2 = 8 is false
 */
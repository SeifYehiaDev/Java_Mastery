/*
 * Author: Seif Yehia
 * Socials: SeifYehiaDev (Facebook, LinkedIn, Instagram, GitHub)
 * Created: 19/07/2025
 */

package Chapter_02_Lists;

import java.util.Scanner;

public class Listing_02_03_ComputeAverage {
    public static void main(String[] args) {
        double firstNumber, secondNumber, thirdNumber, average;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        firstNumber = input.nextDouble();
        secondNumber = input.nextDouble();
        thirdNumber = input.nextDouble();
        average = (firstNumber + secondNumber + thirdNumber) / 3.0;
        System.out.printf("The average of %.1f %.1f %.1f is %.1f", firstNumber, secondNumber, thirdNumber, average);
    }
}

//                                                 _Output One_
/*
Enter three numbers: 1 2 3
The average of 1.0 2.0 3.0 is 2.0
 */

//                                                 _Output Two_
/*
Enter three numbers: 10.5
11
11.5
The average of 10.5 11.0 11.5 is 11.0
 */
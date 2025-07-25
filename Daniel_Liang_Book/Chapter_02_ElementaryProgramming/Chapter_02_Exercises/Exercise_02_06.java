/*
 * Author: Seif Yehia
 * Socials: SeifYehiaDev (Facebook, LinkedIn, Instagram, GitHub)
 * Created: 25/07/2025
 */

package Chapter_02_Exercises;

import java.util.Scanner;

public class Exercise_02_06 {
    public static void main(String[] args) {
        int number, sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        number = input.nextInt();
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.printf("The sum of the digits is %d", sum);
    }
}

//                                                 _Output One_
/*
Enter a number between 0 and 1000: 999
The sum of the digits is 27
 */

//                                                 _Output Two_
/*
Enter a number between 0 and 1000: 932
The sum of the digits is 14
 */
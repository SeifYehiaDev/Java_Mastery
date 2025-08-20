/*
 * Author: Seif Yehia
 * Socials: SeifYehiaDev (Facebook, LinkedIn, Instagram, GitHub)
 * Created: 20/08/2025
 */

package Chapter_03_Exercises;

import java.util.Scanner;

public class Exercise_03_02_V2 {
    public static void main(String[] args) {
        int numbers[] = new int[3], answer;
        Scanner input = new Scanner(System.in);
        for (int index = 0; index < numbers.length; index++)
            numbers[index] = (int) (Math.random() * 10);
        System.out.printf("What is %d + %d + %d? ", numbers[0], numbers[1], numbers[2]);
        answer = input.nextInt();
        System.out.printf("%d + %d + %d = %d is %b", numbers[0], numbers[1], numbers[2],
                answer, (numbers[0] + numbers[1] + numbers[2]) == answer);
    }
}

//                                                 _Output One_
/*
What is 4 + 4 + 5? 13
4 + 4 + 5 = 13 is true
 */

//                                                 _Output Two_
/*
What is 7 + 8 + 1? 7
7 + 8 + 1 = 7 is false
 */
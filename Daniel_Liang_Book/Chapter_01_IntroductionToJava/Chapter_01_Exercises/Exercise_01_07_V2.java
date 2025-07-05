/*
 * Author: Seif Yehia
 * Socials: SeifYehiaDev (Facebook, LinkedIn, Instagram, GitHub)
 * Created: 05/07/2025
 * Purpose: Java learning journey — practice from book and course
 */

package Chapter_01_Exercises;

public class Exercise_01_07_V2 {
    public static void main(String[] args) {
        double sum = 0.0;
        int sign = 1;
        for (int number = 1; number <= 13; number += 2) {
            sum += sign * (1.0 / number);
            sign *= -1;
        }
        System.out.print("PI = " + 4 * sum);
    }
}

//                                                 _Output_
/*
PI = 3.2837384837384844
 */
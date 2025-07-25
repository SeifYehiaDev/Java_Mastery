/*
 * Author: Seif Yehia
 * Socials: SeifYehiaDev (Facebook, LinkedIn, Instagram, GitHub)
 * Created: 25/07/2025
 */

package Chapter_02_Exercises;

import java.util.Scanner;

public class Exercise_02_01 {
    public static void main(String[] args) {
        double celsius, fahrenheit;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a degree in Celsius: ");
        celsius = input.nextDouble();
        fahrenheit = 9 / 5.0 * celsius + 32;
        System.out.printf("%.1f Celsius is %.1f Fahrenheit", celsius, fahrenheit);
    }
}

//                                                 _Output_
/*
Enter a degree in Celsius: 43
43.0 Celsius is 109.4 Fahrenheit
 */
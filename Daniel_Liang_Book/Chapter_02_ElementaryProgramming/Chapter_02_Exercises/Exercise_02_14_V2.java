/*
 * Author: Seif Yehia
 * Socials: SeifYehiaDev (Facebook, LinkedIn, Instagram, GitHub)
 * Created: 25/07/2025
 */

package Chapter_02_Exercises;

import java.util.Scanner;

public class Exercise_02_14_V2 {
    public static void main(String[] args) {
        final double KILOGRAMS_PER_POUND = 0.45359237D, METERS_PER_INCH = 0.0254D;
        double weightInKilograms, heightInMeters, bmi;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        weightInKilograms = input.nextDouble() * KILOGRAMS_PER_POUND;
        System.out.print("Enter height in inches: ");
        heightInMeters = input.nextDouble() * METERS_PER_INCH;
        bmi = weightInKilograms / Math.pow(heightInMeters, 2.0);
        System.out.printf("BMI is %.4f", bmi);
    }
}

//                                                 _Output_
/*
Enter weight in pounds: 95.5
Enter height in inches: 50
BMI is 26.8573
 */
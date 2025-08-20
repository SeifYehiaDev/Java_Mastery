/*
 * Author: Seif Yehia
 * Socials: SeifYehiaDev (Facebook, LinkedIn, Instagram, GitHub)
 * Created: 20/08/2025
 */

package Chapter_03_Exercises;

import java.util.Scanner;

public class Exercise_03_06 {
    public static void main(String[] args) {
        final double KILOGRAMS_PER_POUND = 0.45_359_237, METERS_PER_INCH = 0.0254, METERS_PER_FOOT = 0.3048;
        double weightInPound, feet, inches, weightInKilograms, heightInMeters, bmi;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        weightInPound = input.nextDouble();
        System.out.print("Enter feet: ");
        feet = input.nextDouble();
        System.out.print("Enter inches: ");
        inches = input.nextDouble();
        weightInKilograms = weightInPound * KILOGRAMS_PER_POUND;
        heightInMeters = feet * METERS_PER_FOOT + inches * METERS_PER_INCH;
        bmi = weightInKilograms / Math.pow(heightInMeters, 2.0);
        System.out.printf("""
                        BMI is %.16f
                        %s""",
                bmi, (bmi < 18.5) ? "Underweight" : (bmi < 25.0) ? "Normal" : (bmi < 30.0) ? "Overweight" : "Obese");
    }
}

//                                                 _Output_
/*
Enter weight in pounds: 140
Enter feet: 5
Enter inches: 10
BMI is 20.0877022754045530
Normal
 */
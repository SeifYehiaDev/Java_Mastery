/*
 * Author: Seif Yehia
 * Socials: SeifYehiaDev (Facebook, LinkedIn, Instagram, GitHub)
 * Created: 19/08/2025
 */

package Chapter_03_Lists;

import java.util.Scanner;

public class Listing_03_04_ComputeAndInterpretBMI_V2 {
    public static void main(String[] args) {
        final double KILOGRAMS_PER_POUND = 0.45_359_237, METERS_PER_INCH = 0.0254;
        double weightInPounds, weightInKilograms, heightInInches, heightInMeters, bmi;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        weightInPounds = input.nextDouble();
        System.out.print("Enter height in inches: ");
        heightInInches = input.nextDouble();
        weightInKilograms = weightInPounds * KILOGRAMS_PER_POUND;
        heightInMeters = heightInInches * METERS_PER_INCH;
        bmi = weightInKilograms / Math.pow(heightInMeters, 2.0);
        System.out.printf("BMI is %.16f\n", bmi);
        System.out.print((bmi < 18.5) ? "Underweight" : (bmi < 25.0) ? "Normal" : (bmi < 30.0) ? "Overweight" : "Obese");
    }
}

//                                                 _Output_
/*
Enter weight in pounds: 146
Enter height in inches: 70
BMI is 20.9486038014933160
Normal
 */
/*
 * Author: Seif Yehia
 * Socials: SeifYehiaDev (Facebook, LinkedIn, Instagram, GitHub)
 * Created: 19/08/2025
 */

package Chapter_03_Lists;

import java.util.Scanner;

public class Listing_03_04_ComputeAndInterpretBMI_V1 {
    public static void main(String[] args) {
        final double KILOGRAMS_PER_POUND = 0.45_359_237, METERS_PER_INCH = 0.0254;
        double weightInPounds, weightInKilograms, heightInInches, heightInMeters, bmi;
        String interpretation;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        weightInPounds = input.nextDouble();
        System.out.print("Enter height in inches: ");
        heightInInches = input.nextDouble();
        weightInKilograms = weightInPounds * KILOGRAMS_PER_POUND;
        heightInMeters = heightInInches * METERS_PER_INCH;
        bmi = weightInKilograms / Math.pow(heightInMeters, 2.0);
        System.out.printf("BMI is %.16f\n", bmi);
        if (bmi < 18.5)
            interpretation = "Underweight";
        else if (bmi < 25.0)
            interpretation = "Normal";
        else if (bmi < 30.0)
            interpretation = "Overweight";
        else
            interpretation = "Obese";
        System.out.print(interpretation);
    }
}

//                                                 _Output_
/*
Enter weight in pounds: 146
Enter height in inches: 70
BMI is 20.9486038014933160
Normal
 */
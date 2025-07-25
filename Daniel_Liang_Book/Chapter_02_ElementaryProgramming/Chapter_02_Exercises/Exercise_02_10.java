/*
 * Author: Seif Yehia
 * Socials: SeifYehiaDev (Facebook, LinkedIn, Instagram, GitHub)
 * Created: 25/07/2025
 */

package Chapter_02_Exercises;

import java.util.Scanner;

public class Exercise_02_10 {
    public static void main(String[] args) {
        double weight, initialTemperature, finalTemperature, energy;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of water in kilograms: ");
        weight = input.nextDouble();
        System.out.print("Enter the initial temperature: ");
        initialTemperature = input.nextDouble();
        System.out.print("Enter the final temperature: ");
        finalTemperature = input.nextDouble();
        energy = weight * (finalTemperature - initialTemperature) * 4184;
        System.out.printf("The energy needed is %.1f", energy);
    }
}

//                                                 _Output_
/*
Enter the amount of water in kilograms: 55.5
Enter the initial temperature: 3.5
Enter the final temperature: 10.5
The energy needed is 1625484.0
 */
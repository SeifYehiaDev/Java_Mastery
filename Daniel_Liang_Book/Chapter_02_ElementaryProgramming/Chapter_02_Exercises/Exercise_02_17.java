/*
 * Author: Seif Yehia
 * Socials: SeifYehiaDev (Facebook, LinkedIn, Instagram, GitHub)
 * Created: 25/07/2025
 */

package Chapter_02_Exercises;

import java.util.Scanner;

public class Exercise_02_17 {
    public static void main(String[] args) {
        double temperature, windSpeed, windChill;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        temperature = input.nextDouble();
        System.out.print("Enter the wind speed (>=2) in miles per hour: ");
        windSpeed = input.nextDouble();
        windChill = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temperature * Math.pow(windSpeed, 0.16);
        System.out.printf("The wind chill index is %f", windChill);
    }
}

//                                                 _Output_
/*
Enter the temperature in Fahrenheit between -58°F and 41°F: 5.3
Enter the wind speed (>=2) in miles per hour: 6
The wind chill index is -5.567068
 */
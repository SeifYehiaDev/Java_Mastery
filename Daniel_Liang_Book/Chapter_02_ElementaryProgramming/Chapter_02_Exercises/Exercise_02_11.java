/*
 * Author: Seif Yehia
 * Socials: SeifYehiaDev (Facebook, LinkedIn, Instagram, GitHub)
 * Created: 25/07/2025
 */

package Chapter_02_Exercises;

import java.util.Scanner;

public class Exercise_02_11 {
    public static void main(String[] args) {
        final int CURRENT_POPULATION = 312_032_486, SECONDS_IN_YEAR = 31_536_000;
        int years;
        double population, populationPerYear;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        years = input.nextInt();
        populationPerYear = SECONDS_IN_YEAR / 7.0 + SECONDS_IN_YEAR / 45.0 - SECONDS_IN_YEAR / 13.0;
        population = CURRENT_POPULATION + populationPerYear * years;
        System.out.printf("The population in %d years is %d", years, (int) Math.ceil(population));
    }
}

//                                                 _Output_
/*
Enter the number of years: 5
The population in 5 years is 325932970
 */
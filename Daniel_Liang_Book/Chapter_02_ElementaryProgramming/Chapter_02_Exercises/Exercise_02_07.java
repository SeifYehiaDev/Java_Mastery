/*
 * Author: Seif Yehia
 * Socials: SeifYehiaDev (Facebook, LinkedIn, Instagram, GitHub)
 * Created: 25/07/2025
 */

package Chapter_02_Exercises;

import java.util.Scanner;

public class Exercise_02_07 {
    public static void main(String[] args) {
        long minutes, years, days, hours, totalDays;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        minutes = input.nextLong();
        hours = minutes / 60;
        totalDays = hours / 24;
        years = totalDays / 365;
        days = totalDays % 365;
        System.out.printf("%d minutes is approximately %d years and %d days", minutes, years, days);
    }
}

//                                                 _Output_
/*
Enter the number of minutes: 1000000000
1000000000 minutes is approximately 1902 years and 214 days
 */
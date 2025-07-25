/*
 * Author: Seif Yehia
 * Socials: SeifYehiaDev (Facebook, LinkedIn, Instagram, GitHub)
 * Created: 25/07/2025
 */

package Chapter_02_Exercises;

import java.util.Scanner;

public class Exercise_02_08 {
    public static void main(String[] args) {
        int offset;
        long totalSecond = System.currentTimeMillis() / 1000, seconds, minutes, hours;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the time zone offset to GMT: ");
        offset = input.nextInt();
        seconds = totalSecond % 60;
        minutes = (totalSecond /= 60) % 60;
        hours = (totalSecond /= 60) % 24;
        System.out.printf("The current time is %s:%s:%s %s", String.format("%02d", (hours + offset) % 12), String.format("%02d", minutes), String.format("%02d", seconds), (hours > 12) ? "PM" : "AM");
    }
}

//                                                 _Output_
/*
Enter the time zone offset to GMT: 3
The current time is 06:23:03 PM
 */
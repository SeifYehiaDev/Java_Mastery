/*
 * Author: Seif Yehia
 * Socials: SeifYehiaDev (Facebook, LinkedIn, Instagram, GitHub)
 * Created: 19/07/2025
 */

package Chapter_02_Lists;

import java.util.Scanner;

public class Listing_02_05_DisplayTime {
    public static void main(String[] args) {
        int seconds, remainingSeconds, minutes;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer for seconds: ");
        seconds = input.nextInt();
        minutes = seconds / 60;
        remainingSeconds = seconds % 60;
        System.out.printf("%d seconds is %d minutes and %d seconds", seconds, minutes, remainingSeconds);
    }
}

//                                                 _Output_
/*
Enter an integer for seconds: 500
500 seconds is 8 minutes and 20 seconds
 */
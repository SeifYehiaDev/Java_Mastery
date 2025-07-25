/*
 * Author: Seif Yehia
 * Socials: SeifYehiaDev (Facebook, LinkedIn, Instagram, GitHub)
 * Created: 24/07/2025
 */

package Chapter_02_Lists;

public class Listing_02_07_ShowCurrentTime {
    public static void main(String[] args) {
        long totalSeconds, seconds, minutes, hours;
        totalSeconds = System.currentTimeMillis() / 1000;
        seconds = totalSeconds % 60;
        totalSeconds /= 60;
        minutes = totalSeconds % 60;
        totalSeconds /= 60;
        hours = totalSeconds % 24;
        System.out.printf("Current time is %2d:%2d:%2d %s\n", (hours + 3) % 12, minutes, seconds, (hours > 12) ? "PM" : "AM");
        System.out.printf("Current time is %s:%s:%s %s", String.format("%02d", (hours + 3) % 12), String.format("%02d", minutes), String.format("%02d", seconds), (hours > 12) ? "PM" : "AM");
    }
}

//                                                 _Output_
/*
Current time is  6:47: 9 PM
Current time is 06:47:09 PM
 */
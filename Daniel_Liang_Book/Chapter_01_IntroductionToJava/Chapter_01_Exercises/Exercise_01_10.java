/*
 * Author: Seif Yehia
 * Socials: SeifYehiaDev (Facebook, LinkedIn, Instagram, GitHub)
 * Created: 19/07/2025
 */

package Chapter_01_Exercises;

public class Exercise_01_10 {
    public static void main(String[] args) {
        final double DISTANCE_IN_KILOMETERS = 14.0, TIME_IN_MINUTES = 45.5,
                KILOMETERS_PER_MILE = 1.6, MINUTES_PER_HOUR = 60.0;
        double speedInMph, distanceInMiles, timeInHours;
        distanceInMiles = DISTANCE_IN_KILOMETERS / KILOMETERS_PER_MILE;
        timeInHours = TIME_IN_MINUTES / MINUTES_PER_HOUR;
        speedInMph = distanceInMiles / timeInHours;
        System.out.printf("""
                A runner runs 14 kilometers in 45 minutes and 30 seconds.
                A runner runs %.16f miles per hour.""", speedInMph);
    }
}

//                                                 _Output_
/*
A runner runs 14 kilometers in 45 minutes and 30 seconds.
A runner runs 11.5384615384615380 miles per hour.
 */
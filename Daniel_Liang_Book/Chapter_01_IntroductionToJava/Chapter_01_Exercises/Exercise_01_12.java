/*
 * Author: Seif Yehia
 * Socials: SeifYehiaDev (Facebook, LinkedIn, Instagram, GitHub)
 * Created: 19/07/2025
 */

package Chapter_01_Exercises;

public class Exercise_01_12 {
    public static void main(String[] args) {
        final double KILOMETERS_PER_MILE = 1.6D, DISTANCE_IN_MILES = 24.0D;
        double speedInKph, distanceInKilometers, timeInHour;
        distanceInKilometers = DISTANCE_IN_MILES * KILOMETERS_PER_MILE;
        timeInHour = 1 + 40 / 60.0 + 35 / 3600.0;
        speedInKph = distanceInKilometers / timeInHour;
        System.out.printf("""
                A runner runs 24 miles in 1 hour, 40 minutes, and 35 seconds.
                A runner runs %.16f kilometers per hour.""", speedInKph);
    }
}

//                                                 _Output_
/*
A runner runs 24 miles in 1 hour, 40 minutes, and 35 seconds.
A runner runs 22.9063794531897320 kilometers per hour.
 */
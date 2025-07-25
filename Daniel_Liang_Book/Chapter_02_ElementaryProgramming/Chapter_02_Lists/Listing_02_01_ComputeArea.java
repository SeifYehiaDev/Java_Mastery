/*
 * Author: Seif Yehia
 * Socials: SeifYehiaDev (Facebook, LinkedIn, Instagram, GitHub)
 * Created: 19/07/2025
 */

package Chapter_02_Lists;

public class Listing_02_01_ComputeArea {
    public static void main(String[] args) {
        final double RADIUS = 20.0D;
        double area = Math.PI * Math.pow(RADIUS, 2.0);
        System.out.printf("The area for the circle of radius %.1f is %.13f", RADIUS, area);
    }
}

//                                                 _Output_
/*
The area for the circle of radius 20.0 is 1256.6370614359173
 */
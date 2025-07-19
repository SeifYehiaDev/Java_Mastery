/*
 * Author: Seif Yehia
 * Socials: SeifYehiaDev (Facebook, LinkedIn, Instagram, GitHub)
 * Created: 19/07/2025
 */

package Chapter_02_Lists;

import java.util.Scanner;

public class Listing_02_04_ComputeAreaWithConstant {
    public static void main(String[] args) {
        final double PI = Math.PI;
        double radius, area;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for radius: ");
        radius = input.nextDouble();
        area = Math.pow(radius, 2.0) * PI;
        System.out.printf("The area for the circle of radius %.1f is %.7f", radius, area);
    }
}

//                                                 _Output_
/*
Enter a number for radius: 20
The area for the circle of radius 20.0 is 1256.6370614
 */
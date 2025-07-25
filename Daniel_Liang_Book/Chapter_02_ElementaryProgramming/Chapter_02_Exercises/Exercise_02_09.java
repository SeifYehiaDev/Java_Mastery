/*
 * Author: Seif Yehia
 * Socials: SeifYehiaDev (Facebook, LinkedIn, Instagram, GitHub)
 * Created: 25/07/2025
 */

package Chapter_02_Exercises;

import java.util.Scanner;

public class Exercise_02_09 {
    public static void main(String[] args) {
        double acceleration, initialVelocity, finalVelocity, time;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter v0, v1, and t: ");
        initialVelocity = input.nextDouble();
        finalVelocity = input.nextDouble();
        time = input.nextDouble();
        acceleration = (finalVelocity - initialVelocity) / time;
        System.out.printf("The average acceleration is %.4f", acceleration);
    }
}

//                                                 _Output_
/*
Enter v0, v1, and t: 5.5 50.9 4.5
The average acceleration is 10.0889
 */
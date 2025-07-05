/*
 * Author: Seif Yehia
 * Socials: SeifYehiaDev (Facebook, LinkedIn, Instagram, GitHub)
 * Created: 05/07/2025
 * Purpose: Java learning journey — practice from book and course
 */

package Chapter_01_Exercises;

public class Exercise_01_08 {
    public static void main(String[] args) {
        final double RADIUS = 5.5;
        System.out.printf("""
                The perimeter of a circle is %f
                The area of a circle is %f""",
                2 * Math.PI * RADIUS, Math.pow(RADIUS, 2.0) * Math.PI);
    }
}

//                                                 _Output_
/*
The perimeter of a circle is 34.557519
The area of a circle is 95.033178
 */
/*
 * Author: Seif Yehia
 * Socials: SeifYehiaDev (Facebook, LinkedIn, Instagram, GitHub)
 * Created: 05/07/2025
 */

package Chapter_01_Exercises;

public class Exercise_01_09 {
    public static void main(String[] args) {
        final double WIDTH = 4.5, HEIGHT = 7.9;
        System.out.printf("""
                        The perimeter of a rectangle is %.1f
                        The area of a rectangle is %.2f""",
                2 * (WIDTH + HEIGHT), WIDTH * HEIGHT);
    }
}

//                                                 _Output_
/*
The perimeter of a rectangle is 24.8
The area of a rectangle is 35.55
 */
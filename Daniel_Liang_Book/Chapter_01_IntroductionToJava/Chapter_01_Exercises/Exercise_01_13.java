/*
 * Author: Seif Yehia
 * Socials: SeifYehiaDev (Facebook, LinkedIn, Instagram, GitHub)
 * Created: 19/07/2025
 */

package Chapter_01_Exercises;

public class Exercise_01_13 {
    public static void main(String[] args) {
        final double a = 3.4, b = 50.2, e = 44.5, c = 2.1, d = 0.55, f = 5.9;
        double x, y, determinant;
        determinant = a * d - b * c;
        x = (e * d - b * f) / determinant;
        y = (a * f - e * c) / determinant;
        System.out.printf("""
                3.4x + 50.2y = 44.5
                2.1x + 0.55y = 5.9
                x = %.16f
                y = %.16f""", x, y);
    }
}

//                                                 _Output_
/*
3.4x + 50.2y = 44.5
2.1x + 0.55y = 5.9
x = 2.6239014968614190
y = 0.7087397392563978
 */
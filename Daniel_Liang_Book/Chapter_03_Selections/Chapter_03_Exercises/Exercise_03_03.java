/*
 * Author: Seif Yehia
 * Socials: SeifYehiaDev (Facebook, LinkedIn, Instagram, GitHub)
 * Created: 20/08/2025
 */

package Chapter_03_Exercises;

import java.util.Scanner;

public class Exercise_03_03 {
    public static void main(String[] args) {
        double a, b, c, d, e, f, determinant;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c, d, e, f: ");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        d = input.nextDouble();
        e = input.nextDouble();
        f = input.nextDouble();
        determinant = a * d - b * c;
        if (determinant == 0)
            System.out.print("The equation has no solution");
        else
            System.out.printf("x is %.1f and y is %.1f", (e * d - b * f) / determinant, (a * f - e * c) / determinant);

    }
}

//                                                 _Output One_
/*
Enter a, b, c, d, e, f: 9.0 4.0 3.0 -5.0 -6.0 -21.0
x is -2.0 and y is 3.0
 */

//                                                 _Output Two_
/*
Enter a, b, c, d, e, f: 1.0 2.0 2.0 4.0 4.0 5.0
The equation has no solution
 */
/*
 * Author: Seif Yehia
 * Socials: SeifYehiaDev (Facebook, LinkedIn, Instagram, GitHub)
 * Created: 20/08/2025
 */

package Chapter_03_Exercises;

import java.util.Scanner;

public class Exercise_03_01 {
    public static void main(String[] args) {
        double a, b, c, discriminant, firstRoot, secondRoot;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        discriminant = Math.pow(b, 2.0) - 4 * a * c;
        if (discriminant < 0)
            System.out.print("The equation has no real roots");
        else {
            firstRoot = (-b + Math.sqrt(discriminant)) / (2 * a);
            if (discriminant == 0)
                System.out.printf("The equation has one root %f", firstRoot);
            else {
                secondRoot = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.printf("The equation has two roots %f and %f", firstRoot, secondRoot);
            }
        }
    }
}

//                                                 _Output One_
/*
Enter a, b, c: 1.0 3 1
The equation has two roots -0.381966 and -2.618034
 */

//                                                 _Output Two_
/*
Enter a, b, c: 1 2.0 1
The equation has one root -1.000000
 */

//                                                 _Output Three_
/*
Enter a, b, c: 1 2 3
The equation has no real roots
 */
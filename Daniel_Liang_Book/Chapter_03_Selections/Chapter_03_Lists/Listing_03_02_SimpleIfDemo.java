/*
 * Author: Seif Yehia
 * Socials: SeifYehiaDev (Facebook, LinkedIn, Instagram, GitHub)
 * Created: 19/08/2025
 */

package Chapter_03_Lists;

import java.util.Scanner;

public class Listing_03_02_SimpleIfDemo {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        number = input.nextInt();
        if (number % 5 == 0)
            System.out.println("HiFive");
        if (number % 2 == 0)
            System.out.print("HiEven");
    }
}

//                                                 _Output One_
/*
Enter an integer: 4
HiEven
 */

//                                                 _Output Two_
/*
Enter an integer: 30
HiFive
HiEven
 */
/*
 * Author: Seif Yehia
 * Socials: SeifYehiaDev (Facebook, LinkedIn, Instagram, GitHub)
 * Created: 19/08/2025
 */

package Chapter_03_Lists;

import java.util.Scanner;

public class Listing_03_09_ChineseZodiac_V2 {
    public static void main(String[] args) {
        final String[] CHINESE_ZODIAC = {"monkey", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit", "dragon", "snake", "horse", "sheep"};
        int year;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        year = input.nextInt();
        System.out.print(CHINESE_ZODIAC[year % 12]);
    }
}

//                                                 _Output One_
/*
Enter a year: 1963
rabbit
 */

//                                                 _Output Two_
/*
Enter a year: 1877
ox
 */
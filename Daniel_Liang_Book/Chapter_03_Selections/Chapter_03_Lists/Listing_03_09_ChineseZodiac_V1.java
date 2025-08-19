/*
 * Author: Seif Yehia
 * Socials: SeifYehiaDev (Facebook, LinkedIn, Instagram, GitHub)
 * Created: 19/08/2025
 */

package Chapter_03_Lists;

import java.util.Scanner;

public class Listing_03_09_ChineseZodiac_V1 {
    public static void main(String[] args) {
        int year;
        String chineseZodiac = null;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        year = input.nextInt();
        switch (year % 12) {
            case 0: chineseZodiac = "monkey";break;
            case 1: chineseZodiac = "rooster";break;
            case 2: chineseZodiac = "dog";break;
            case 3: chineseZodiac = "pig";break;
            case 4: chineseZodiac = "rat";break;
            case 5: chineseZodiac = "ox";break;
            case 6: chineseZodiac = "tiger";break;
            case 7: chineseZodiac = "rabbit";break;
            case 8: chineseZodiac = "dragon";break;
            case 9: chineseZodiac = "snake";break;
            case 10: chineseZodiac = "horse";break;
            case 11: chineseZodiac = "sheep";break;
        }
        System.out.print(chineseZodiac);
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
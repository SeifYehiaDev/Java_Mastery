/*
 * Author: Seif Yehia
 * Socials: SeifYehiaDev (Facebook, LinkedIn, Instagram, GitHub)
 * Created: 05/07/2025
 */

package Chapter_01_Lists;

public class Listing_01_06_ShowLogicErrors_V1 {
    public static void main(String[] args) {
        System.out.println("Celsius 35 is Fahrenheit degree");
        System.out.println(9 / 5 * 35 + 32);
        System.out.println(" After correct the logic error....");
        System.out.println("Celsius 35 is Fahrenheit degree");
        System.out.print(9.0 / 5 * 35 + 32);
    }
}

//                                                 _Output_
/*
Celsius 35 is Fahrenheit degree
67
After correct the logic error....
Celsius 35 is Fahrenheit degree
95.0
 */
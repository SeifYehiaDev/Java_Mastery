/*
 * Author: Seif Yehia
 * Socials: SeifYehiaDev (Facebook, LinkedIn, Instagram, GitHub)
 * Created: 05/07/2025
 * Purpose: Java learning journey — practice from book and course
 */

package Chapter_01_Lists;

public class Listing_01_05_ShowRuntimeErrors {
    public static void main(String[] args) {
        System.out.print(1 / 0);
    }
}

//                                                 _Output_
/*
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at Chapter_01_Lists.Listing_01_05_ShowRuntimeErrors.main(Listing_01_05_ShowRuntimeErrors.java:12)
 */
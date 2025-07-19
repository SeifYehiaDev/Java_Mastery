/*
 * Author: Seif Yehia
 * Socials: SeifYehiaDev (Facebook, LinkedIn, Instagram, GitHub)
 * Created: 05/07/2025
 */

package Chapter_01_Exercises;

public class Exercise_01_07_V1 {
    public static void main(String[] args) {
        System.out.println("Approximate PI for I = 11: " + 4 * (1 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11));
        System.out.print("Approximate PI for I = 13: " + 4 * (1 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11 + 1.0 / 13));
    }
}

//                                                 _Output_
/*
Approximate PI for I = 11: 2.9760461760461765
Approximate PI for I = 13: 3.2837384837384844
 */
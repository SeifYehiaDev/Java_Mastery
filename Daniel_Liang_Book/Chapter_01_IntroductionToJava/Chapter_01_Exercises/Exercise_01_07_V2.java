/*
 * Author: Seif Yehia
 * Socials: SeifYehiaDev (Facebook, LinkedIn, Instagram, GitHub)
 * Created: 05/07/2025
 */

package Chapter_01_Exercises;

public class Exercise_01_07_V2 {
    public static void main(String[] args) {
        System.out.println("Approximate PI for I = 11: " + computePI(11));
        System.out.print("Approximate PI for I = 13: " + computePI(13));
    }

    public static double computePI(final int value) {
        double sum = 0.0;
        int sign = 1;
        for (int index = 1; index <= value; sign *= -1, index += 2)
            sum += sign * (1.0 / index);
        return 4 * sum;
    }
}

//                                                 _Output_
/*
Approximate PI for I = 11: 2.9760461760461765
Approximate PI for I = 13: 3.2837384837384844
 */
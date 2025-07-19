/*
 * Author: Seif Yehia
 * Socials: SeifYehiaDev (Facebook, LinkedIn, Instagram, GitHub)
 * Created: 05/07/2025
 */

package Chapter_01_Exercises;

public class Exercise_01_06_V3 {
    public static void main(String[] args) {
        System.out.print("The summation of series is " + sumOfSeries(1, 9));
    }

    public static int sumOfSeries(int firstNumber, int lastNumber) {
        int n = lastNumber - firstNumber + 1;
        double middle = (firstNumber + lastNumber) / 2.0;
        return (int) (n * middle);
    }
}

//                                                 _Output_
/*
The summation of series is 45
 */
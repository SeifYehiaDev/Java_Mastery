/*
 * Author: Seif Yehia
 * Socials: SeifYehiaDev (Facebook, LinkedIn, Instagram, GitHub)
 * Created: 05/07/2025
 * Purpose: Java learning journey — practice from book and course
 */

package Chapter_01_Exercises;

public class Exercise_01_04_V2 {
    public static void main(String[] args) {
        System.out.println("a     a^2     a^3");
        for (int index = 1; index <= 4; index++)
            System.out.printf("%-6d%-8d%d\n", index, (int) Math.pow(index, 2), (int) Math.pow(index, 3));
    }
}

//                                                 _Output_
/*
a     a^2     a^3
1     1       1
2     4       8
3     9       27
4     16      64
 */
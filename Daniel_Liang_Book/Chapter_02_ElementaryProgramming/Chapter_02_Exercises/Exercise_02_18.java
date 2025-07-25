/*
 * Author: Seif Yehia
 * Socials: SeifYehiaDev (Facebook, LinkedIn, Instagram, GitHub)
 * Created: 25/07/2025
 */

package Chapter_02_Exercises;

public class Exercise_02_18 {
    public static void main(String[] args) {
        System.out.println("a     b     pow(a,b)");
        for (int a = 1; a <= 5; a++)
            System.out.printf("%-6d%-6d%d\n", a, a + 1, (int) Math.pow(a, a + 1));
    }
}

//                                                 _Output_
/*
a     b     pow(a,b)
1     2     1
2     3     8
3     4     81
4     5     1024
5     6     15625
 */
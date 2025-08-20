/*
 * Author: Seif Yehia
 * Socials: SeifYehiaDev (Facebook, LinkedIn, Instagram, GitHub)
 * Created: 20/08/2025
 */

package Chapter_03_Exercises;

import java.util.Scanner;

public class Exercise_03_05 {
    public static void main(String[] args) {
        final String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int today, NumberOfDays;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter today's day: ");
        today = input.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        NumberOfDays = input.nextInt();
        System.out.printf("Today is %s and the future day is %s", DAYS[today], DAYS[(today + NumberOfDays) % 7]);
    }
}

//                                                 _Output One_
/*
Enter today's day: 1
Enter the number of days elapsed since today: 3
Today is Monday and the future day is Thursday
 */

//                                                 _Output Two_
/*
Enter today's day: 0
Enter the number of days elapsed since today: 31
Today is Sunday and the future day is Wednesday
 */
/*
 * Author: Seif Yehia
 * Socials: SeifYehiaDev (Facebook, LinkedIn, Instagram, GitHub)
 * Created: 19/07/2025
 */

package Chapter_01_Exercises;

public class Exercise_01_11 {
    public static void main(String[] args) {
        final byte SECONDS_OF_BIRTH = 7, SECONDS_OF_DEATH = 13, SECONDS_OF_IMMIGRANT = 45;
        final double CURRENT_POPULATION = 312_032_486.0, SECONDS_IN_YEAR = 31_536_000.0;
        final double POPULATION_PER_YEAR = (SECONDS_IN_YEAR / SECONDS_OF_BIRTH) + (SECONDS_IN_YEAR / SECONDS_OF_IMMIGRANT) - (SECONDS_IN_YEAR / SECONDS_OF_DEATH);
        System.out.printf("""
                Population projection
                Current population: %d
                One birth every %d seconds.
                One death every %d seconds.
                One new immigrant every %d seconds.
                """, (int) CURRENT_POPULATION, SECONDS_OF_BIRTH, SECONDS_OF_DEATH, SECONDS_OF_IMMIGRANT);
        for (int year = 1; year <= 5; year++)
            System.out.printf("Year %d projection: %d\n", year, (int) Math.ceil(CURRENT_POPULATION + POPULATION_PER_YEAR * year));
    }
}

//                                                 _Output_
/*
Population projection
Current population: 312032486
One birth every 7 seconds.
One death every 13 seconds.
One new immigrant every 45 seconds.
Year 1 projection: 314812583
Year 2 projection: 317592680
Year 3 projection: 320372777
Year 4 projection: 323152873
Year 5 projection: 325932970
 */
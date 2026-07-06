package exercises.conditionals;

import java.util.Scanner;

public class GameDurationCalculator {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Algorithm that calculates the total duration of a game based on its starting and ending hours");
        System.out.println("Enter the initial hour");
        int iHour = keyboard.nextInt();
        System.out.println("Enter the final hour");
        int fHour = keyboard.nextInt();
        if (iHour >= fHour) {
            fHour = fHour + 24;
        }
        int duration = fHour - iHour;
        System.out.println("The duration of the game was " + duration + " hours");
    }
}

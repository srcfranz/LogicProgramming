package exercises.conditionals;

import java.util.Scanner;

public class FullGameDurationCalculator {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Algorithm that calculates the exact duration of a game in hours and minutes based on its start and end times");
        System.out.println("Enter the start hour");
        int startHour = keyboard.nextInt();
        System.out.println("Enter the start minutes");
        int startMinutes = keyboard.nextInt();
        System.out.println("Enter the final hour");
        int finalHour = keyboard.nextInt();
        System.out.println("Enter the final minutes");
        int finalMinutes = keyboard.nextInt();
        int startTotalMinutes = (startHour * 60) + startMinutes;
        int finalTotalMinutes = (finalHour * 60) + finalMinutes;
        if (startTotalMinutes >= finalTotalMinutes) {
            finalTotalMinutes = finalTotalMinutes + 1440;
        }
        int totalMinutes = finalTotalMinutes - startTotalMinutes;
        int durationHour = totalMinutes / 60;
        int durationMinutes = totalMinutes % 60;
        System.out.println("The game duration was " + durationHour + " hours and " + durationMinutes + " minutes");
    }
}

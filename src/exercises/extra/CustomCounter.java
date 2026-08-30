package exercises.extra;

import java.util.Scanner;

public class CustomCounter {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Algorithm that counts from a starting number to an ending number");
        System.out.println("Enter the starting number");
        int start = keyboard.nextInt();
        System.out.println("Enter the ending number");
        int end = keyboard.nextInt();
        System.out.println("Do you want to change the step value ( 1 to count by 1s, 2 to count by 2s )? [y/n]");
        char changeStep = keyboard.next().charAt(0);
        int step = 1;
        if (changeStep == 'y' || changeStep == 'Y') {
            System.out.println("Enter the step value");
            step = keyboard.nextInt();
        }
        if (start < end) {
            while (start <= end) {
                System.out.println(start);
                start = start + step;
            }
        } else {
            while (start >= end) {
                System.out.println(start);
                start = start - step;
            }
        }
    }
}
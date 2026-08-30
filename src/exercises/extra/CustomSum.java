package exercises.extra;

import java.util.Scanner;

public class CustomSum {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Algorithm that sums as many numbers as the user wants");
        System.out.println("How many numbers do you want to sum?");
        int counter = keyboard.nextInt();
        int times = 0;
        int s = 0;
        int n = 0;
        while (times < counter) {
            System.out.println("Enter number " + (times + 1));
            n = keyboard.nextInt();
            s = n + s;
            times = times + 1;
        }
        System.out.println("The sum of all numbers is " + s);
    }
}
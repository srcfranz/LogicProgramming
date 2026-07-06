package exercises.conditionals;

import java.util.Scanner;

public class PositiveOrNegative {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Algorithm that reads a number and checks if it's positive or negative and if it's odd or even");
        System.out.println("Enter a number");
        int n = keyboard.nextInt();
        if (n % 2 == 0) {
            if (n >= 0) {
                System.out.println(n + " is an even and positive number");
            } else {
                System.out.println(n + " is an even and negative number");
            }
        } else {
            if (n > 0) {
                System.out.println(n + " is an odd and positive number");
            } else {
                System.out.println(n + " is an odd and negative number");
            }
        }
    }
}
/* Write an algorithm that reads a number and determines whether it is divisible by 5 or 7. */

package exercises.conditionals;

import java.util.Scanner;

public class DivisibleByFiveAndSeven {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Algorithm that checks if a number is divisible by 5 and 7");
        System.out.println("Enter a number");
        int n = keyboard.nextInt();
        if (n % 5 == 0 && n % 7 == 0) {
            System.out.println(n + " is divisible by both 5 and 7");
        } else if (n % 5 == 0 && n % 7 != 0) {
            System.out.println(n + " is divisible by 5, but not by 7");
        } else if (n % 5 != 0 && n % 7 == 0) {
            System.out.println(n + " is divisible by 7, but not by 5");
        } else {
            System.out.println(n + " isn't divisible by 5 or 7");
        }
    }
}

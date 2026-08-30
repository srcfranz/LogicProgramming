/* Write an algorithm that reads a number and determines whether it is divisible by both 2 and 3. */

package exercises.conditionals;

import java.util.Scanner;

public class DivisibleByTwoAndThree {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Algorithm that checks if a number is divisible by 2 and 3");
        System.out.println("Enter a number");
        int n = keyboard.nextInt();
        if (n % 2 == 0 && n % 3 == 0) {
            System.out.println(n + " is divisible by both 2 and 3");
        } else {
            System.out.println(n + " is not divisible by both 2 and 3");
        }
    }

}

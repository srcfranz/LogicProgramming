/* Write an algorithm that reads a number and displays whether it is even or odd.
Hint: A number is even if the remainder of its division by 2 is zero. */

package exercises.conditionals;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Algorithm that checks if a number is odd or even");
        System.out.println("Enter a number");
        int n = keyboard.nextInt();
        if (n % 2 == 0) {
            System.out.println(n + " is an even number");
        } else {
            System.out.println(n + " is an odd number");
        }
    }
}

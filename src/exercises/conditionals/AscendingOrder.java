/* Write an algorithm that reads two numbers and displays them in ascending order. */

package exercises.conditionals;

import java.util.Scanner;

public class AscendingOrder {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Algorithm that sorts two numbers in ascending order");
        System.out.println("Enter two numbers");
        double n = keyboard.nextDouble();
        double n2 = keyboard.nextDouble();
        if (n > n2) {
            System.out.println("Ascending order: " + n2 + ", " + n);
        } else if (n == n2) {
            System.out.println("They're the same number");
        } else {
            System.out.println("Ascending order: " + n + ", " + n2);
        }
    }
}

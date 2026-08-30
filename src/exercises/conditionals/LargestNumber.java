/* Write an algorithm that reads two numbers and displays the larger one. */

package exercises.conditionals;

import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Algorithm that reads two numbers and checks which one is larger");
        System.out.println("Enter two numbers");
        int n = keyboard.nextInt();
        int n2 = keyboard.nextInt();
        if (n > n2) {
            System.out.println(n + " is larger than " + n2);
        } else if (n == n2) {
            System.out.println("They're the same number");
        } else {
            System.out.println(n2 + " is larger than " + n);
        }
    }
}

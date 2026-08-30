/* Write an algorithm that reads two values into variables A and B, swaps their values so that A contains the original value of B and B contains the original value of A, and displays the swapped values. */

package exercises.basics;

import java.util.Scanner;

public class Swapvalues {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Algorithm that swaps values of variables");
        System.out.println("Enter two values, the first for variable A and the second for B");
        double a = keyboard.nextDouble();
        double b = keyboard.nextDouble();
        double c = a;
        a = b;
        b = c;
        System.out.println("Now the value of A is " + a + " and value for B is " + b);
    }
}

/* Write an algorithm that reads 3 numbers and displays the smallest one. */

package exercises.conditionals;

import java.util.Scanner;

public class LowestNumber {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Algorithm that reads three numbers and shows the lowest one");
        System.out.println("Enter three numbers");
        double n = keyboard.nextDouble();
        double n2 = keyboard.nextDouble();
        double n3 = keyboard.nextDouble();
        double lowest = n;
        if (n2 < lowest) {
            lowest = n2;
        }
        if (n3 < lowest) {
            lowest = n3;
        }
        System.out.println("The lowest number is " + lowest);
    }
}

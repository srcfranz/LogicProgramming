/* Write an algorithm that reads 3 numbers and displays them in ascending order.
Account for the possibility of duplicate numbers. */

package exercises.conditionals;

import java.util.Scanner;

public class ThreeNumbersAscending {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Algorithm that reads three numbers and displays them in ascending order");
        System.out.println("Enter three numbers");
        double lowest = keyboard.nextDouble();
        double middle = keyboard.nextDouble();
        double highest = keyboard.nextDouble();
        double aux = 0;
        if (middle < lowest) {
            aux = lowest;
            lowest = middle;
            middle = aux;
        }
        if (highest < lowest) {
            aux = lowest;
            lowest = highest;
            highest = aux;
        }
        if (middle > highest) {
           aux = highest;
           highest = middle;
           middle = aux;
        }
        System.out.println("Ascending order: " + lowest + ", " + middle + " and " + highest);
    }
}
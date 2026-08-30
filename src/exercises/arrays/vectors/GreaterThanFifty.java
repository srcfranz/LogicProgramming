/* Populate an array of size 10 with numbers. Then display a list of numbers greater than 50.
The program should display a message if none exist. */

package exercises.arrays.vectors;

import java.util.Scanner;

public class GreaterThanFifty {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Algorithm that reads 10 numbers into an array and lists those greater than 50");

        int[] numbers = new int[10];
        boolean greaterFifty = false;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number");
            numbers[i] = keyboard.nextInt();
            if (numbers[i] > 50) {
                greaterFifty = true;
            }
        }

        if (greaterFifty) {
            System.out.print("Numbers entered that are greater than fifty: ");
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > 50) {
                    System.out.print(numbers[i] + " ");
                }
            }
            System.out.println();
        } else {
            System.out.println("None of the numbers entered are greater than 50");
        }
    }
}
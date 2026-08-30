/* Populate an array with 5 numbers entered by the user. Then display the even numbers. */

package exercises.arrays.vectors;

import java.util.Scanner;

public class EvenNumbers {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Algorithm that reads 5 numbers into an array and displays only the even numbers");

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter the a number");
            numbers[i] = keyboard.nextInt();
        }

        System.out.print("Even numbers that were entered: ");

        for (int i = 0; i < numbers.length; i++) {
           if (numbers[i] % 2 == 0) {
               System.out.print(numbers[i] + " ");
           }
        }
        System.out.println();
    }
}
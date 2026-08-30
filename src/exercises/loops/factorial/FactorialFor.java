package exercises.loops.factorial;

import java.util.Scanner;

public class FactorialFor {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Algorithm that calculates the factorial of a number entered by the user using a for loop");
        System.out.println("Enter a number");
        int n = keyboard.nextInt();
        int result = n;
        for (int count = n - 1; count > 0; count--) {
            result *= count;
        }
        System.out.println("The result of " + n + "! is " + result);
    }
}
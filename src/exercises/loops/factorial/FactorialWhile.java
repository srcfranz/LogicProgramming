package exercises.loops.factorial;

import java.util.Scanner;

public class FactorialWhile {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Algorithm that calculates the factorial of a number entered by the user using a while loop");
        System.out.println("Enter a number");
        int n = keyboard.nextInt();
        int count = n - 1;
        int result = n;
        while (count > 0) {
            result = result * count;
            count--;
        }
        System.out.println("The result of " + n + "! is " + result);
    }
}
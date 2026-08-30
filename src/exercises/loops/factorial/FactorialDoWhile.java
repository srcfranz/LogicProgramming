package exercises.loops.factorial;

import java.util.Scanner;

public class FactorialDoWhile {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Algorithm that calculates the factorial of a number entered by the user using a do-while loop");
        System.out.println("Enter a number");
        int n = keyboard.nextInt();
        int result = n;
        int count = n - 1;
        do {
            result = result * count;
            count--;
        } while (count > 0);
        System.out.println("The result of " + n + "! is " + result);
    }
}
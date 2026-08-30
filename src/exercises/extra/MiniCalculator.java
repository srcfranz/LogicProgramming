package exercises.extra;

import java.util.Scanner;

public class MiniCalculator {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Algorithm that performs basic math operations");
        System.out.println("Enter a number");
        double n = keyboard.nextDouble();
        System.out.println("Enter one of these: +  -  *  /");
        char operator = keyboard.next().charAt(0);
        System.out.println("Enter another number");
        double n2 = keyboard.nextDouble();
        System.out.print(n + " " + operator + " " + n2 + " = ");
        double result = 0;
        switch (operator) {
            case '+':
                result = n + n2;
                System.out.println(result);
                break;
            case '-':
                result = n - n2;
                System.out.println(result);
                break;
            case '*':
                result = n * n2;
                System.out.println(result);
                break;
            case '/':
                if (n2 != 0) {
                    result = n / n2;
                    System.out.println(result);
                } else {
                    System.out.println("Cannot divide by zero!");
                }
                break;
            default:
                System.out.println("Invalid operator!");
                break;
        }

    }
}
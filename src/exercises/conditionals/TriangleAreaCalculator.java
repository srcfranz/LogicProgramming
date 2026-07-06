package exercises.conditionals;

import java.util.Scanner;

public class TriangleAreaCalculator {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Algorithm that verifies if three sides form a triangle and calculates its area");
        System.out.println("Enter three values");
        int a = keyboard.nextInt();
        int b = keyboard.nextInt();
        int c = keyboard.nextInt();
        if ((a + b) > c && (b + c) > a && (a + c) > b) {
            double s = (a + b + c) / 2.0;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.println("The values " + a + ", " + b + " and " + c + " form a triangle! Its area is " + area + ".");
        } else {
            System.out.println("The values " + a + ", " + b + " and " + c + " do not form a triangle.");
        }
    }
}

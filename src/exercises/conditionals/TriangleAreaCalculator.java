/* Develop an algorithm that reads 3 positive integer values (a, b, c) and checks whether they can form a valid triangle (remember that the sum of any two sides must be greater than the third side).
If they form a triangle, calculate and display the area of the triangle.
If they do not form a triangle, display the original three values. */

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

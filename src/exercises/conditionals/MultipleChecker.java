/* Develop an algorithm that reads 2 values, A and B.
Display them along with a message indicating whether they are multiples of each other ("They are multiples" or "They are not multiples"). */

package exercises.conditionals;

import java.util.Scanner;

public class MultipleChecker {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Algorithm that reads two numbers and determines if they are multiples");
        System.out.println("Enter two numbers");
        int n = keyboard.nextInt();
        int n2 = keyboard.nextInt();
        int multiple = 0;
        if (n >= n2) {
            multiple = n % n2;
            if (multiple == 0) {
                System.out.println(n + " is a multiple of " + n2);
            } else {
                System.out.println("They're not multiples");
            }
        } else {
            multiple = n2 % n;
            if (multiple == 0) {
                System.out.println(n2 + " is a multiple of " + n);
            } else {
                System.out.println("They're not multiples");
            }
        }
    }
}

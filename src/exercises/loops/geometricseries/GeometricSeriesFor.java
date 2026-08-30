package exercises.loops.geometricseries;

import java.util.Scanner;

public class GeometricSeriesFor {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Algorithm that displays the geometric series of powers of two up to the nth term specified by the user using a for loop");
        System.out.println("Enter how many terms you want to see in the sequence");
        int limit = keyboard.nextInt();
        int exponentiation = 1;
        for (int value = 1; value <= limit; value++) {
            exponentiation *= 2;
            System.out.print(exponentiation + " ");
        }
    }
}
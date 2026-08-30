package exercises.loops.geometricseries;

import java.util.Scanner;

public class GeometricSeriesWhile {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Algorithm that displays the geometric series of powers of two up to the nth term specified by the user using a while loop");
        System.out.println("Enter how many terms you want to see in the sequence");
        int limit = keyboard.nextInt();
        int exponentiation = 1;
        int value = 1;
        while (value <= limit) {
            exponentiation *= 2;
            System.out.print(exponentiation + " ");
            value++;
        }
    }
}
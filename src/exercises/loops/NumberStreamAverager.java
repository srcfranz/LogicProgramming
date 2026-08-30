package exercises.loops;

import java.util.Scanner;

public class NumberStreamAverager {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Algorithm that reads a sequence of numbers until zero is entered, then displays the count and their average");
        double n;
        int count = 0;
        double sum = 0;
        do {
            System.out.println("Enter a number");
            n = keyboard.nextDouble();
            if (n != 0) {
                count++;
                sum += n;
            }
        } while (n != 0);
        if (count > 0) {
            double avrg = sum / count;
            System.out.println("A total of " + count + " numbers were entered excluding zero, and their average is " + avrg);
        } else {
            System.out.println("No number was entered, except zero");
        }
    }
}
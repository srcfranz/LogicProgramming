package exercises.conditionals;

import java.util.Scanner;

public class ArithmeticOrWeighted {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Algorithm that reads three grades, and the user chooses if they want the arithmetic average or the weighted average");
        System.out.println("Enter three grades");
        double g = keyboard.nextDouble();
        double g2 = keyboard.nextDouble();
        double g3 = keyboard.nextDouble();
        System.out.println("If you want the arithmetic average, then enter A. If want the weighted average, then enter W. [A/W]");
        char option = keyboard.next().charAt(0);
        double average = 0;
        if (option == 'a' || option == 'A') {
            average = (g + g2 + g3) / 3;
            System.out.println("Your arithmetic average is " + average);
        } else if (option == 'w' || option == 'W') {
            double weightedg = g * 3;
            double weightedg2 = g2 * 3;
            double weightedg3 = g3 * 4;
            average = (weightedg + weightedg2 + weightedg3) / 10;
            System.out.println("Your weighted average is " + average);
        } else {
            System.out.println("Invalid value!");
        }
    }
}
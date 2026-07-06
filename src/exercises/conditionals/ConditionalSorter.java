package exercises.conditionals;

import java.util.Scanner;

public class ConditionalSorter {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Algorithm that reads an operation code and three numbers, then sorts them in ascending, descending, or specific order");
        System.out.println("Choose a value for I");
        System.out.println("[1] to show values in ascending order");
        System.out.println("[2] to show values in descending order");
        System.out.println("[3] to show values with the highest being in the middle");
        int i = keyboard.nextInt();
        System.out.println("Enter three values");
        double lowest = keyboard.nextDouble();
        double middle = keyboard.nextDouble();
        double highest = keyboard.nextDouble();
        double aux = 0;
        if (middle < lowest) {
            aux = lowest;
            lowest = middle;
            middle = aux;
        }
        if (highest < lowest) {
            aux = lowest;
            lowest = highest;
            highest = aux;
        }
        if (middle > highest) {
            aux = highest;
            highest = middle;
            middle = aux;
        }
        switch (i) {
            case 1 -> System.out.println(lowest + ", " + middle + " and " + highest);
            case 2 -> System.out.println(highest + ", " + middle + " and " + lowest);
            case 3 -> System.out.println(lowest + ", " + highest + " and " + middle);
            default -> System.out.println("Invalid value for I");
        }
    }
}

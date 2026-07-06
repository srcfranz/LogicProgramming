package exercises.conditionals;

import java.util.Scanner;

public class BanknoteDecomposer {

    public static void main(String[] args) {
        // Hi! This exercise was categorized under "Conditional Structures" by my teacher, but I managed to solve it without using conditionals.

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Algorithm that decomposes a monetary value into the minimum number of banknotes");
        System.out.println("Enter a value");
        int initialV = keyboard.nextInt();
        int v = initialV;
        int notes100 = v / 100;
        v = v % 100;
        int notes50 = v / 50;
        v = v % 50;
        int notes10 = v / 10;
        v = v % 10;
        int notes5 = v / 5;
        v = v % 5;
        System.out.println("The minimum number of notes to have " + initialV + " is: " + notes100 + " notes of 100, " + notes50 + " notes of 50, " + notes10 + " notes of 10, " + notes5 + " notes of 5 and " + v + " notes of 1");
    }
}

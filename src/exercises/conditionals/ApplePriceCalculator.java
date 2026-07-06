package exercises.conditionals;

import java.util.Scanner;

public class ApplePriceCalculator {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Algorithm that calculates the total cost of apples based on the quantity purchased");
        System.out.println("How many apples are you going to buy?");
        int apples = keyboard.nextInt();
        double value = apples;
        if (apples < 12) {
            value = apples * 1.30;
        }
        System.out.println("You are going to pay R$" + value + " for " + apples + " apples");
    }
}

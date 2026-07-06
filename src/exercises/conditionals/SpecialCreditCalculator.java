package exercises.conditionals;

import java.util.Scanner;

public class SpecialCreditCalculator {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Algorithm that calculates a client's special credit based on their average annual balance");
        System.out.println("What is your average balance");
        double average = keyboard.nextDouble();
        double credit = 0;
        if (average > 200 && average <= 400) {
            credit = average * 0.2;
        } else if (average < 601) {
            credit = average * 0.3;
        } else {
            credit = average * 0.4;
        }
        if (credit <= 0) {
            System.out.println("You don't receive any special credit");
        } else {
            System.out.println("Your balance is " + average + " and your special credit is " + credit);
        }
    }
}
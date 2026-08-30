/* A bank is offering a special credit line to its clients based on their average account balance over the past year.
Write an algorithm that reads a client's average balance, calculates the credit amount according to the table below, and displays the average balance along with the approved credit amount:

- Average Balance: $0 to $200 -> No credit
- Average Balance: $201 to $400 -> 20% of the average balance
- Average Balance: $401 to $600 -> 30% of the average balance
- Average Balance: Above $601 -> 40% of the average balance */

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
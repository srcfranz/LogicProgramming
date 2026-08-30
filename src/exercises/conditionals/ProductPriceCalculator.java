/* A salesperson needs an algorithm to calculate the total price owed by a customer. The algorithm should receive a product code and the quantity purchased, then calculate and display the total price using the table below:

- Product Code 5  -> Unit Price: $32.00
- Product Code 6  -> Unit Price: $45.00
- Product Code 2  -> Unit Price: $37.00
- Product Code 12 -> Unit Price: $44.00 */

package exercises.conditionals;

import java.util.Scanner;

public class ProductPriceCalculator {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Algorithm that calculates the total price of a purchase based on product code and quantity");
        System.out.println("What is the code of your product?");
        int code = keyboard.nextInt();
        System.out.println("How much did you buy?");
        int quantity = keyboard.nextInt();
        double total = 0;
        switch (code) {
            case 5 -> total = quantity * 32;
            case 6 -> total = quantity * 45;
            case 2 -> total = quantity * 37;
            case 12 -> total = quantity * 44;
            default -> System.out.print("Invalid product code, ");
        }
        if (total != 0) {
            System.out.println("The total price is " + total);
        } else {
            System.out.println("try again!");
        }
    }
}

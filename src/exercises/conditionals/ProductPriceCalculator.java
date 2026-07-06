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

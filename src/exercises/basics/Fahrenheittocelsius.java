/* Write an algorithm that reads a temperature in Fahrenheit and displays it converted to Celsius.
Use the following conversion formula, where F is the temperature in Fahrenheit and C is the temperature in Celsius:
C = (F - 32) * (5 / 9) */

package exercises.basics;

import java.util.Scanner;

public class Fahrenheittocelsius {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Algorithm that converts temperatures");
        System.out.println("Enter a temperature in Fahrenheit");
        double fahrenheit = keyboard.nextDouble();
        double celsius = (fahrenheit - 32) *  5 / 9;
        System.out.println("The conversion to Celsius is " + celsius);
    }
}

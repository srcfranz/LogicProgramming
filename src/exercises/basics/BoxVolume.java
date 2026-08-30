/* Write an algorithm that reads the LENGTH, WIDTH, and HEIGHT of a rectangular box, calculates its volume, and displays the result. Use the following formula:
VOLUME = LENGTH * WIDTH * HEIGHT */

package exercises.basics;

import java.util.Scanner;

public class BoxVolume {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Algorithm that calculates the volume of a box");
        System.out.println("Enter the length of the box");
        double length = keyboard.nextDouble();
        System.out.println("Enter the width of the box");
        double width = keyboard.nextDouble();
        System.out.println("Enter the height of the box");
        double height = keyboard.nextDouble();
        double vol = length * width * height;
        System.out.println("The volume of the box is " + vol);
    }
}

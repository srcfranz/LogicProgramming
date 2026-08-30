/* Write an algorithm that calculates and displays the volume of an oil can using the following formula:
VOLUME = 3.14159 * RADIUS * RADIUS * HEIGHT */

package exercises.basics;

import java.util.Scanner;

public class OilCanVolume {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Algorithm that calculates the volume of an oil can");
        System.out.println("Enter the height of the oil can");
        double height = keyboard.nextDouble();
        System.out.println("Enter the radius of the oil can");
        double radius = keyboard.nextDouble();
        double volume = Math.PI * radius * radius * height;
        System.out.println("The volume of the oil can is " + volume);
    }

}

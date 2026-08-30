/* Write an algorithm that reads a student's three grades.
Calculate the student's weighted average, assigning a weight of 4 to the highest grade and a weight of 3 to the other two grades.
Display the student ID, the three grades, the calculated average, and the message "APPROVED" if the average is 5 or higher, or "FAILED" if the average is below 5. */

package exercises.conditionals;

import java.util.Scanner;

public class WeightedGradeAverage {

    public static void main (String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Algorithm that calculates a student's weighted average");
        System.out.println("Enter 3 grades");
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
        double weightedG1 = lowest * 3;
        double weightedG2 = middle * 3;
        double weightedHG = highest * 4;
        double total = weightedG1 + weightedG2 + weightedHG;
        double weightedAverage = total / 10;
        if (weightedAverage >= 5) {
            System.out.println("Your weighted average is " + weightedAverage + ", you passed!");
        } else {
            System.out.println("Your weighted average is " + weightedAverage + ", you failed!");
        }
    }
}

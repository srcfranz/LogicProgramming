/* Calculate the arithmetic mean of 3 grades of a student.
Display the calculated average along with the message "Approved" if the average is 6 or higher, or "Failed" otherwise. */

package exercises.conditionals;

import java.util.Scanner;

public class GradeAverage {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Algorithm that calculates a student's average grade");
        System.out.println("Enter three grades"); // I think it'd be more interesting if I asked how many evaluative activities the user has, but my teacher said three grades, so I'm doing three grades
        double g = keyboard.nextDouble();
        double g2 = keyboard.nextDouble();
        double g3 = keyboard.nextDouble();
        double average = (g + g2 + g3) / 3;
        if (average >= 6) {
            System.out.println("Your average is " + average + ", you passed!");
        } else {
            System.out.println("Your average is " + average + ", you failed!");
        }
    }
}

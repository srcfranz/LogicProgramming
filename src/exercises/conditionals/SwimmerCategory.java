/* Develop an algorithm that reads the name and age of a swimmer, then displays their name along with their age category based on the following rules:

- Infant A: 5 to 7 years old
- Infant B: 8 to 10 years old
- Junior A: 11 to 13 years old
- Junior B: 14 to 17 years old
- Adult: 18 years old and older */

package exercises.conditionals;

import java.util.Scanner;

public class SwimmerCategory {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Algorithm that classifies a swimmer into a category based on their age");
        System.out.println("What's your name?");
        String name = keyboard.nextLine();
        System.out.println("How old are you?");
        int age = keyboard.nextInt();
        if (age <= 7 && age >= 5) {
            System.out.println("Hi, " + name + "! You're in Junior A!");
        } else if (age >= 8 && age <= 10) {
            System.out.println("Hi, " + name + "! You're in Junior B!");
        } else if (age >= 11 && age <= 13) {
            System.out.println("Hi, " + name + "! You're in Teen A!");
        } else if (age >= 14 && age <= 17) {
            System.out.println("Hi, " + name + "! You're in Teen B!");
        } else if (age >= 18) {
            System.out.println("Hi, " + name + "! You're in Adult!");
        } else {
            System.out.println("Hi, " + name + "! You're too young to join!");
        }
    }
}

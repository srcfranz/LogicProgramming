/* A company is granting salary increases to its employees based on their job positions. Write an algorithm that reads an employee's current salary and job code, then calculates their new salary. If the job code is not in the table, the employee receives a 40% raise. Display the old salary, the new salary, and the difference amount.

- Code 101: Manager -> 10% raise
- Code 102: Engineer -> 20% raise
- Code 103: Technician -> 30% raise */

package exercises.conditionals;

import java.util.Scanner;

public class SalaryRaiseCalculator {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Algorithm that calculates an employee's salary raise and new salary based on their job code");
        System.out.println("What is your salary?");
        double s = keyboard.nextDouble();
        System.out.println("What is the code of your job?");
        int code = keyboard.nextInt();
        double newS = 0;
        switch (code) {
            case 101 -> newS = s * 1.1;
            case 102 -> newS = s * 1.2;
            case 103 -> newS = s * 1.3;
            default -> newS = s * 1.4;
        }
        double difference = newS - s;
        System.out.println("Your previous salary was R$" + s + ", now it's R$" + newS + ". The raise was R$" + difference + ".");
    }
}

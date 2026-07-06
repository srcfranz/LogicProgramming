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

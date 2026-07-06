package exercises.loops;

import java.util.Scanner;

public class PasswordValidator {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Algorithm that repeatedly requests a 4-digit numeric password until the correct one is entered");
        int password = 6769;
        int attempt;
        do {
            System.out.println("Enter the password");
            attempt = keyboard.nextInt();
            if (attempt != password) {
                System.out.println("Wrong password. Try again!");
            }
        } while (attempt != password);
        System.out.println("Access granted!");
    }
}
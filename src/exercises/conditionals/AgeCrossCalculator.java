package exercises.conditionals;

import java.util.Scanner;

public class AgeCrossCalculator {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Algorithm that reads the ages of two men and two women to calculate specific sums and products based on their age differences");
        System.out.println("Enter the ages of two men");
        int olderMan = keyboard.nextInt();
        int youngerMan = keyboard.nextInt();
        System.out.println("Enter the ages of two women");
        int olderWoman = keyboard.nextInt();
        int youngerWoman = keyboard.nextInt();
        int aux = 0;
        if (olderMan < youngerMan) {
            aux = olderMan;
            olderMan = youngerMan;
            youngerMan = aux;
        }
        if (olderWoman < youngerWoman) {
            aux = olderWoman;
            olderWoman = youngerWoman;
            youngerWoman = aux;
        }
        int s = olderMan + youngerWoman;
        int p = olderWoman * youngerMan;
        System.out.println("The sum of the older man's and the younger woman's age is " + s);
        System.out.println("The product of the younger man's and the older woman's age is " + p);
    }
}
package exercises.conditionals;

import java.util.Scanner;

public class MatchResultDeterminer {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Algorithm that reads two team names and their goals to determine the match winner or a draw");
        System.out.println("Enter the name and goals of one team");
        String team1 = keyboard.next();
        int goals1 = keyboard.nextInt();
        System.out.println("Enter the name and goals of the other team");
        String team2 = keyboard.next();
        int goals2 = keyboard.nextInt();
        if (goals1 > goals2) {
            System.out.println("The winner is " + team1);
        } else if (goals2 > goals1) {
            System.out.println("The winner is " + team2);
        } else {
            System.out.println("DRAW");
        }
    }
}

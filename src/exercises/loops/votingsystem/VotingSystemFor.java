package exercises.loops.votingsystem;

import java.util.Scanner;

public class VotingSystemFor {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Algorithm that simulates an electronic voting system using a for loop");
        System.out.println("How many voters are there?");
        int voters = keyboard.nextInt();
        int candidateA = 0, candidateB = 0, candidateC = 0, blank = 0, nullVotes = 0;

        for (int votes = 0; votes != voters; votes++) {
            System.out.println("Choose your option:");
            System.out.println(" 1 - Candidate A");
            System.out.println(" 2 - Candidate B");
            System.out.println(" 3 - Candidate C");
            System.out.println(" 4 - Blank");
            int voted = keyboard.nextInt();
            switch (voted) {
                case 1 -> candidateA++;
                case 2 -> candidateB++;
                case 3 -> candidateC++;
                case 4 -> blank++;
                default -> nullVotes++;
            }
        }
        System.out.println("Voting results:");
        System.out.println(" Candidate A had " + candidateA + " votes ");
        System.out.println(" Candidate B had " + candidateB + " votes ");
        System.out.println(" Candidate C had " + candidateC + " votes ");
        System.out.println(" A total of " + blank + " blank votes ");
        System.out.println(" And a total of " + nullVotes + " null votes!");
        System.out.println();
        String winner;
        if (candidateA > candidateB) {
            if (candidateA > candidateC) {
                winner = "Candidate A";
            } else {
                winner = "Candidate C";
            }
        } else if (candidateB > candidateC) {
            winner = "Candidate B";
        } else {
            winner = "Candidate C";
        }
        System.out.println("The winner is " + winner);
    }
}
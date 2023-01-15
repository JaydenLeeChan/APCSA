package newstuff;

import java.util.*;
import java.io.*;

public class LP314 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Election Results for New York:");
        System.out.print("Aubrey: ");
        int aubreyNY = input.nextInt();
        System.out.print("Martinez: ");
        int martinezNY = input.nextInt();
        System.out.println();

        System.out.println("Election Results for New Jersey:");
        System.out.print("Aubrey: ");
        int aubreyNJ = input.nextInt();
        System.out.print("Martinez: ");
        int martinezNJ = input.nextInt();
        System.out.println();

        System.out.println("Election Results for Connecticut:");
        System.out.print("Aubrey: ");
        int aubreyCN = input.nextInt();
        System.out.print("Martinez: ");
        int martinezCN = input.nextInt();
        System.out.println();

        int totalAubrey = aubreyCN + aubreyNJ + aubreyNY;
        int totalMartinez = martinezCN + martinezNJ + martinezNY;

        ClLP314 calc = new ClLP314(totalAubrey, totalMartinez);

        int total = totalAubrey+totalMartinez;

        System.out.println("Candidate\tVotes\tPercentage");
        System.out.println("Aubrey\t" + totalAubrey + "\t" + calc.aubreyPercent() + "%");
        System.out.println("Martinez\t" + totalMartinez + "\t" + calc.martinezPercent() + "%");
        System.out.println("TOTAL VOTES: " + total);


    }
}
/*
Election Results for New York:
Aubrey: 314159
Martinez: 271860

Election Results for New Jersey:
Aubrey: 89008
Martinez: 121032

Election Results for Connecticut:
Aubrey: 213451
Martinez: 231034

Candidate	Votes	Percentage
Aubrey	616618	49.71%
Martinez	623926	50.29%
TOTAL VOTES: 1240544

Process finished with exit code 0
 */
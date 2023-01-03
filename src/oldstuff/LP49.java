package oldstuff;

import java.util.*;

public class LP49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 20: ");
        int pl = input.nextInt();
        int sec = (int)(Math.random() * (21 - 1) + 1);
        System.out.println("Computer's Number: " + sec);
        System.out.println("Player's Number: " + pl);
        if (pl == sec) System.out.println("You won!");
        else System.out.println("Better luck next time!");

    }
}
/*
Enter a number between 1 and 20: 14
Computer's Number: 1
Player's Number: 14
Better luck next time!

Process finished with exit code 0
 */
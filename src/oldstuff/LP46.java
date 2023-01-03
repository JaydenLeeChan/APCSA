package oldstuff;

import java.util.*;

public class LP46 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        int fir = (int)(Math.random() * (11 - 1) + 1);
        int sec = (int)(Math.random() * (11 - 1) + 1);
        int rand = (int)(Math.random() * (5 - 1) + 1);

        double sol = 0;
        double usl = 0;

        if (rand == 1) {
            System.out.print("What is " + fir + " * " + sec + "? ");
            sol = fir * sec;
            usl = input.nextDouble();
            if (sol == usl) System.out.println("Correct!");
            else System.out.println("Wrong!");
        }
        if (rand == 2) {
            System.out.print("What is " + fir + " + " + sec + "? ");
            sol = fir + sec;
            usl = input.nextDouble();
            if (sol == usl) System.out.println("Correct!");
            else System.out.println("Wrong!");
        }
        if (rand == 3) {
            System.out.print("What is " + fir + " - " + sec + "? ");
            sol = fir - sec;
            usl = input.nextDouble();
            if (sol == usl) System.out.println("Correct!");
            else System.out.println("Wrong!");
        }
        if (rand == 4) {
            System.out.print("What is " + fir + " / " + sec + "? ");
             sol = Math.round((double) fir / sec * 1000.0)/1000.0;
             usl = input.nextDouble();
             if (sol == usl) System.out.println("Correct!");
             else System.out.println("Wrong!");
        }

    }
}
/*
What is 8 - 5? 3
Correct!

Process finished with exit code 0
 */
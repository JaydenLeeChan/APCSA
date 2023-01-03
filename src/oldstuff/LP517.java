package oldstuff;

import java.util.*;

public class LP517 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pass = "it's 5 am why am I even doing this";
        int lcv = 0;
        int k;
        String c;
        while (lcv < 2) {
            System.out.print("Enter the password: ");
            c = input.nextLine();
            if (pass.equals(c)) {
                System.out.println("Welcome");

                return;
            }
            else System.out.println("The password you typed is incorrect.");
            lcv++;

        }
        System.out.print("Enter the password: ");
        c = input.nextLine();
        if (pass.equals(c)) {
            System.out.println("Welcome");
        }
        else System.out.println("Access denied.");

    }
}
/*
Enter the password: fdsfsd
The password you typed is incorrect.
Enter the password: sdfsd
The password you typed is incorrect.
Enter the password: it's 5 am why am I even doing this
Welcome

Process finished with exit code 0
 */
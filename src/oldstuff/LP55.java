package oldstuff;

import java.util.*;

public class LP55 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int m = input.nextInt();
        String k = String.valueOf(m);
        int lcv = 0;


        while (lcv < k.length()) {
            System.out.println(k.charAt(lcv));
            lcv++;
        }
    }
}
/*
Enter a positive integer: 546
5
4
6

Process finished with exit code 0
 */
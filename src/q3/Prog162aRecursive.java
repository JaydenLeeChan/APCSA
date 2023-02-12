package q3;

import java.util.*;

public class Prog162aRecursive {
    public static int factorial(int n) {
        if (n == 1) return n; // Base/ending Case
        else return n * factorial(n-1); // Recursive Case

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        while (num != 0) {
            int fact = factorial(num);
            System.out.println(fact);
            System.out.println("Enter a number: ");
            num = input.nextInt();

        }
    }
}

package oldstuff;

import java.util.*;

public class Prog58h {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Amount Saved?");
        double p = input.nextDouble();
        System.out.println("Interest Rate?");
        double r = input.nextDouble();
        System.out.println("Number of times compounded per year?");
        double n = input.nextDouble();
        System.out.println("Number of days at interest?");
        double t = input.nextDouble();


        double Amount = p * Math.pow((1 + ((.01 * r) / n)), ((n * t) / 365));

        System.out.println("The interest earned is " + (Amount-p));
        System.out.println("The total amount in savings is now " + (Amount));




    }
}

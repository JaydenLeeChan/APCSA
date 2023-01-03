package oldstuff;

import java.util.*;

public class Prog72t {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first time: ");
        double first = input.nextDouble();
        System.out.println("Enter the second time: ");
        double second = input.nextDouble();

        if (first < second) {
            double hours = second - first;
            System.out.println(((hours - (hours % 60))/60) + " hours " + (hours % 60) + " minutes ");
        } else {
            System.out.println("no");
        }
    }
}

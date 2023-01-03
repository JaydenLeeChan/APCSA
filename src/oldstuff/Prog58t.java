package oldstuff;//kill me now
//-Jayden Chan

import java.util.*;

public class Prog58t {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter purchase price: ");
        double pp = input.nextDouble();
        System.out.println("Enter amount received: ");
        double r = input.nextDouble();

        double c = (r - pp) * 100;

        System.out.println("Change due: " + c / 100);

        double dl = c/100;
        dl = Math.floor(dl);
        c = c - (100 * dl);
        System.out.println("Dollars: " + dl);

        double qu = c/25;
        qu = Math.floor(qu);
        c = c - (25 * qu);
        System.out.println("Quarters: " + qu);

        double di = c/10;
        di = Math.floor(di);
        c = c - (10 * di);
        System.out.println("Dimes: " + di);

        double ni = c/5;
        ni = Math.floor(ni);
        c = c - (5 * ni);
        System.out.println("Nickels: " + ni);

        double pe = c;
        System.out.println("Pennies: " + pe);
/*
Enter purchase price:
7.67
Enter amount received:
10
Change due: 2.33
Dollars: 2.0
Quarters: 1.0
Dimes: 0.0
Nickels: 1.0
Pennies: 3.0

Process finished with exit code 0
 */

    }
}

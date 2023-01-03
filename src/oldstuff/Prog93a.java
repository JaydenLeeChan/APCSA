package oldstuff;

import java.util.*;

public class Prog93a {
    public static void main(String[] args) {
        System.out.print("Enter KWH used: ");
        Scanner input = new Scanner(System.in);
        double kwh = input.nextDouble();
        System.out.println("C O M P S C I  E L E C T R I C");
        System.out.println("------------------------------------------------");
        System.out.println("Kilowatts Used = " + kwh);
        System.out.println("------------------------------------------------");

        double base = Math.round(kwh * 0.0475 * 100.0)/100.0;

        System.out.println("Base Rate " + kwh + " @ $0.0475 = $" + Math.round(kwh * 0.0475 * 100.0)/100.0);
        //System.out.printf("Base Rate " + kwh + " @ $0.0475 = $%.2f\n", (sur));
        System.out.println("Surcharge = $" + (Math.round(kwh * 0.0475 * 10)/100.0));
        double sur = (Math.round(kwh * 0.0475 * 10)/100.0);
        //System.out.printf("City Tax = $%.2f\n", (0.03 * sur));
        double city = (Math.round(kwh * 0.0475 * 100 * 0.03)/100.0);
        System.out.println("City Tax = $" + (Math.round(kwh * 0.0475 * 100 * 0.03)/100.0));
        System.out.println("------------------------------------------------");
        System.out.println("Total = $" + (city + sur + base));
        System.out.println("Total After May 20th = $" + Math.round(1.04 * (city + sur + base)*100.0)/100.0);
        //System.out.printf("Total = $%.2f\n", (1.13 * sur));
        //System.out.printf("Total after May 20 = $%.2f\n", (1.04 * (1.13 * sur)));

    }
}

/*
Enter KWH used: 993
C O M P S C I  E L E C T R I C
------------------------------------------------
Kilowatts Used = 993.0
------------------------------------------------
Base Rate 993.0 @ $0.0475 = $47.17
Surcharge = $4.72
City Tax = $1.42
------------------------------------------------
Total = $53.31
Total After May 20th = $55.44

Process finished with exit code 0
 */

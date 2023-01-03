package oldstuff;

import java.util.*;

public class Prog65h {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter pounds: ");
        double po = input.nextDouble();
        System.out.println("Enter shillings: ");
        double sh = input.nextDouble();
        System.out.println("Enter pence: ");
        double pe = input.nextDouble();

        double totalPence =  (pe / (12 * 20)) + sh / 20;
        double totalPounds = po + totalPence;

        System.out.printf("Decimal Pounds: %.2f", totalPounds);
    }

}

/*
Enter pounds:
7
Enter shillings:
7
Enter pence:
7
Decimal Pounds: 7.38
Process finished with exit code 0
 */
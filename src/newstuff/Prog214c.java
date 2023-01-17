package newstuff;

import java.util.Scanner;

public class Prog214c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cl214c ok = new Cl214c();

        System.out.println("How many gallons?");
        int gallons = input.nextInt();

        System.out.println("What type? (R, P, or H)");
        double ppg = 0;
        if(input.nextLine().equals("R")) {
            ppg = 1.359;
        }
        else if(input.nextLine().equals("P")) {
            ppg = 1.479;
        }
        else if(input.nextLine().equals("H")) {
            ppg = 1.429;
        }

        System.out.println("Do you want a car wash? (Y or N)");
        boolean wash = false;
        if(input.nextLine().equals("Y")) {
            wash = true;
        }

        double washPrice = 2.00;
        int excessGallons = gallons-10;
        if(excessGallons>0) {
            if(excessGallons>10) {
                washPrice = 0.00;
            }
            else {
                washPrice = washPrice-(excessGallons*0.10);
            }
        }
        if(!wash) washPrice = 0.00;

        ok.addRunningTotal((gallons*ppg+washPrice));

        System.out.println("COMPSCI PETROLEUM COMPANY");
        System.out.println("------------------------------------");
        System.out.println("Premium: " + gallons + " gallons @ " + ppg);
        System.out.println("------------------------------------");
        System.out.println("Gasoline: " + (ppg*gallons));
        System.out.println("Wash: " + washPrice);
        System.out.println("Total Due: " + ok.getRunningTotal());


    }
}
/*
COMPSCI PETROLEUM COMPANY
------------------------------------
Premium: 15 gallons @ 1.479
------------------------------------
Gasoline: 22.185000000000002
Wash: 0.0
Total Due: 22.185000000000002
 */
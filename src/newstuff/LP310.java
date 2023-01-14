package newstuff;

import java.util.*;
import java.io.*;

public class LP310 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of burgers: ");
        int burgers = input.nextInt();

        System.out.print("Enter the number of fries: ");
        int fries = input.nextInt();

        System.out.print("Enter the number of sodas: ");
        int sodas = input.nextInt();

        ClLP310 calc = new ClLP310();

        calc.setBurgersNum(burgers);
        calc.setFriesNum(fries);
        calc.setSodasNum(sodas);

        System.out.println("Total before tax: $" + Math.round(calc.getMyrunningTotal()*100.0)/100.0);
        calc.setMytax();
        System.out.println("Tax: $" + Math.round(calc.getMyTax()*100.0)/100.0);
        System.out.println("Final Total: $" + Math.round(calc.getMyrunningTotal()*100.0)/100.0);

        double finalTotal = Math.round(calc.getMyrunningTotal()*100.0)/100.0;

        System.out.println();
        System.out.print("Enter amount tendered: $");
        double tender = input.nextDouble();
        System.out.println("Change: $" + (tender - Math.round(calc.getMyrunningTotal()*100.0)/100.0));

    }
}
/*
Enter the number of burgers: 2
Enter the number of fries: 5
Enter the number of sodas: 5
Total before tax: $13.78
Tax: $0.9
Final Total: $14.68

Enter amount tendered: $20.00
Change: $5.32

Process finished with exit code 0
 */
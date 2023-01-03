package oldstuff;

import java.util.Scanner;

import static java.lang.System.out;
public class Prog52aClass {
    //Driver Program
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        out.print("Please enter length: ");
        int len = kbd.nextInt();

        out.print("Please enter width: ");
        int wid = kbd.nextInt();
        out.println();

        //Make a new object (instance) of Cl52a (instantiate the class)
        Cl52a wow = new Cl52a(len, wid);

        wow.setStuff();

        //int area = wow.getArea();
        //int perim = wow.getPerim();

        //System.out.println("Area: " + area);
        //System.out.println("Perim: " + perim);

        wow.print();
    }
}

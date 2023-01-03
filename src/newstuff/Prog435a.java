package newstuff;

import java.util.*;
import java.io.*;


public class Prog435a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog435a.dat"));
            //Put code here

            while (input.hasNextLine()) {
                int a = input.nextInt();
                int b = input.nextInt();

                Cl435a bruh = new Cl435a(a, b);
                bruh.setCar();
                bruh.setGate();



            }

        }
        catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}

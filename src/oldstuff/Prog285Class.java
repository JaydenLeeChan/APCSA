package oldstuff;

import java.util.*;
import java.io.*;


public class Prog285Class {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog285b.dat"));
            //Put code here
            while (input.hasNext()) {
                int id = input.nextInt();
                int c = input.nextInt();
                double s = input.nextDouble();

                Salesperson fred = new Salesperson(id, c, s);
                fred.setComm();
                System.out.println(fred.toString());
            }
        }
        catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}

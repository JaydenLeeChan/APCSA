import java.util.*;
import java.io.*;


public class Prog213fClass {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog213f.dat"));

            while (input.hasNext()) {
                Cl213f wow = new Cl213f(input.nextDouble());
                wow.setStuff();
                System.out.println("The cost of " + wow.getKwh() + " KWH is $" + wow.getCost());
            }
        }
        catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
The cost of 1338.0 KWH is $93.66
The cost of 9631.0 KWH is $221.55
The cost of 13561.0 KWH is $682.44
The cost of -999.0 KWH is $0.0

Process finished with exit code 0
 */
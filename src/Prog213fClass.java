import java.util.*;
import java.io.*;

public class Prog213fClass {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog213f.dat"));
            //Put code here
            while(input.hasNext()) {
                Cl213f ok = new Cl213f(input.nextInt());

                ok.setStuff();
                System.out.println(ok.getMoney()/100.0);

            }
        }
        catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}

/*
93.66
140.0
682.44
0.0
 */
package oldstuff;

import java.util.*;
import java.io.*;


public class Prog209a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog215a.dat"));
            //Put code here
            int b500 = 0;
            int ge500 = 0;
            int thing = 0;
            while (input.hasNext()) {
                thing = input.nextInt();
                if (thing < 500) b500++;
                else ge500++;
            }
            System.out.println("Below 500: "+b500);
            System.out.println("Greater than or equal to 500: "+ge500);
        }
        catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
Below 500: 192
Greater than or equal to 500: 208

Process finished with exit code 0

 */

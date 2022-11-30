import java.util.*;
import java.io.*;


public class Prog214b {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog214b.dat"));
            //Put code here
            while (input.hasNext()) {
                int x = input.nextInt();
                System.out.println(x);
            }

        }
        catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
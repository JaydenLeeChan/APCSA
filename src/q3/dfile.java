package q3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class dfile {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog285b.dat"));
            //Put code here
        }
        catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}

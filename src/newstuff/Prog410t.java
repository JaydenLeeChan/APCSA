package newstuff;

import java.io.*;
import java.util.*;

public class Prog410t {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/survey.dat"));
            //Put code here

        }
        catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}

package newstuff;
import java.io.*;
import java.util.*;

public class Cl402a {


    private double mySum = 0;

    private double myAvg = 0;

    public Cl402a () {
       mySum = 0;
       myAvg = 0;

    }

    public void calc(int[] idArray, int[] scoreArray) {
        int counter = 0;
        for (int lcv = 0; !(idArray[lcv] == 0); lcv++)   {
            mySum += scoreArray[lcv];
            counter++;

        }
        myAvg = mySum/counter;
    }

    public double getMySum() { return mySum; }
    public double getMyAvg() { return myAvg; }


}





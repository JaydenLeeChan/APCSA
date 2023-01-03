package newstuff;

import java.io.File;
import java.util.*;

public class Cl435a {
    private int mycarNum= 0;
    private int mygateNum = 0;
    private double mycarFactor = 0;
    private double mygateToll = 0;
    private String mycarType = "";

    public Cl435a (int carNum, int gateNum) {
        mycarNum = carNum;
        mygateNum = gateNum;

    }

    public void setGate() {
/*
1 1.35
2 2.00
3 2.50
4 3.25
5 4.10
6 4.8
7 5.50
8 6.00
*/
        if (mygateNum == 1) mygateToll = 1.35;
        if (mygateNum == 2) mygateToll = 2.00;
        if (mygateNum == 3) mygateToll = 2.50;
        if (mygateNum == 4) mygateToll = 3.25;
        if (mygateNum == 5) mygateToll = 4.10;
        if (mygateNum == 6) mygateToll = 4.80;
        if (mygateNum == 7) mygateToll = 5.50;
        if (mygateNum == 8) mygateToll = 6.00;
    }

    public void setCar() {
        if (mycarNum == 1) {
            mycarFactor = 1.0;
            mycarType = "Compact Car";
        }
        if (mycarNum == 2) {
            mycarFactor = 1.3;
            mycarType = "Small Care";
        }
        if (mycarNum == 3) {
            mycarFactor = 1.6;
            mycarType = "Mid Size Care";
        }
        if (mycarNum == 4) {
            mycarFactor = 2.0;
            mycarType = "Full Size Car";
        }
        if (mycarNum == 5) {
            mycarFactor = 2.4;
            mycarType = "Truck";
        }
        if (mycarNum == 6) {
            mycarFactor = 2.7;
            mycarType = "16 Wheeler";
        }
    }
    public double getMycarFactor() { return mycarFactor; }
    public String getMycarType() { return mycarType; }
    public double getMygateToll() { return mygateToll; }
}


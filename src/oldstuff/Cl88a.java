package oldstuff;

public class Cl88a {
    //Private Data (fields)

    private double myInt1;
    private double myInt2;

    private double mySum;
    private double myDif;

    private double myProd;

    private double myAvg;

    private double myDist;

    private double myMax;
    private double myMin;


    //Constructor: Sets private data
    public Cl88a(int Int1, int Int2) {
        myInt1 = Int1;
        myInt2 = Int2;
        mySum = 0;
        myDif = 0;
        myProd = 0;
        myAvg = 0;
        myDist = 0;
        myMax = 0;
        myMin = 0;
    }

    //Mutator: Modifies private data
    public void setStuff() {
        mySum = myInt1 + myInt2;
        myDif = myInt1 - myInt2;
        myProd = myInt1 * myInt2;
        myAvg = mySum/2;
        myDist = Math.abs(myDif);
        if (myInt1 == myInt2) {
            myMax = myInt1;
            myMin = myInt1;
        }
        else if (myInt1 > myInt2) {
            myMax = myInt1;
            myMin = myInt2;
        }
        else {
            myMax = myInt2;
            myMin = myInt1;
        }
    }

    //Accessors: returns private data

    public double getInt1() {
        return myInt1;
    }
    public double getInt2() {
        return myInt2;
    }
    public double getSum() {
        return mySum;
    }
    public double getDif() {
        return myDif;
    }
    public double getProd() {
        return myProd;
    }
    public double getAvg() {
        return myAvg;
    }
    public double getDist() {
        return myDist;
    }
    public double getMax() {
        return myMax;
    }
    public double getMin() {
        return myMin;
    }










}
/* Class
 * private data
 * constructors
 * modifiers (mutators)
 * accessors
 */
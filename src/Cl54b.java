public class Cl54b {
    //Private Data (fields)
    private int myOne;
    private int myTwo;
    private int myThree;
    private int myFour;

    private int mySum;
    private double myAverage;


    //Constructor: Sets private data
    public Cl54b(int one, int two, int three, int four) {
        myOne = one;
        myTwo = two;
        myThree = three;
        myFour = four;

        mySum = 0;
        myAverage = 0;
    }

    //Mutator: Modifies private data
    public void setStuff() {
        mySum = myOne + myTwo + myThree + myFour;
        myAverage = (double) mySum / 4.0;
    }

    //Accessors: returns private data

    public int getSum() {
        return mySum;
    }

    public double getAvg() {
        return myAverage;
    }
}
/* Class
 * private data
 * constructors
 * modifiers (mutators)
 * accessors
 */
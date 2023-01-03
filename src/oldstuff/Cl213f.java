package oldstuff;

public class Cl213f {
    //Private Data (fields)
    private double mykwh;
    private int myCost;

    //Constructor

    public Cl213f(double kwh) {
        mykwh = kwh;
        myCost = 0;
    }

    //Mutator: Modifies private data
    public void calc() {

        if (mykwh > 0 && mykwh < 2000) {
            myCost += mykwh * 7;
        }
        if (mykwh > 2000) {
            myCost += 2000 * 7;
        }
        if (mykwh > 10000) {
            myCost += 8000 * 5;
            myCost += (mykwh - 10000) * 4;
        }


    }
    //Accessor
    public int getMoney() {
        return myCost;
    }

    public String toString() {
        return "The number of ";
    }
}





/* Class
 * private data
 * constructors
 * modifiers (mutators)
 * accessors
 */
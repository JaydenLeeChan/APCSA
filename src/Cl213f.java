public class Cl213f {
    //Private Data (fields)
    private double myKwh;
    private double myCost;


    //Constructor: Sets private data
    public Cl213f(double kwh) {
        myKwh = kwh;
        myCost = 0;
    }

    //Mutator: Modifies private data
    public void setStuff() {
        if (myKwh > 0 && myKwh <= 2000) {
            myCost += myKwh * 7;
        }
        else if (myKwh > 2000) {
            myCost += 2000 * 7;
            if (myKwh > 10000) {
                myCost += 8000 * 5;
                myCost += (myKwh-10000) * 4;
            }
            else if (myKwh <= 10000) {
                myCost += (myKwh-8000) * 5;
            }
        }

    }

    //Accessors: returns private data

    public double getCost() {
        return myCost/100.0;
    }
    public double getKwh() {
        return myKwh;
    }
}
/* Class
 * private data
 * constructors
 * modifiers (mutators)
 * accessors
 */
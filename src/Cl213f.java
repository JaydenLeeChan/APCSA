public class Cl213f {
    //Private Data (fields)
    private int mykwh;
    private int money;

    //Constructor

    public Cl213f(int kwh) {
        mykwh = kwh;
        money = 0;
    }

    //Mutator: Modifies private data
    public void setStuff() {

        if (mykwh > 0 && mykwh < 2000) {
            money += mykwh * 7;
        }
        if (mykwh > 2000) {
            money += 2000 * 7;
        }
        if (mykwh > 10000) {
            money += 8000 * 5;
            money += (mykwh - 10000) * 4;
        }


    }
    //Accessor
    public int getMoney() {
        return money;
    }
}





/* Class
 * private data
 * constructors
 * modifiers (mutators)
 * accessors
 */
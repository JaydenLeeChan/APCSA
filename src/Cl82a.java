public class Cl82a {
    //Private Data (fields)
    private int myLimit;
    private int mySpeed;
    private double myFine;



    //Constructor: Sets private data
    public Cl82a(int Limit, int Speed) {
        myLimit = Limit;
        mySpeed = Speed;
        myFine = 0;

    }

    //Mutator: Modifies private data
    public void setStuff() {
        myFine = 20 + ((mySpeed - myLimit) * 5);
    }

    //Accessors: returns private data

    public double getFine() {
        return myFine;
    }

}
/* Class
 * private data
 * constructors
 * modifiers (mutators)
 * accessors
 */
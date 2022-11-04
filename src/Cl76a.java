public class Cl76a {
    //Private Data (fields)
    private int myNum;
    private int myEnd1;
    private int myEnd2;


    //Constructor: Sets private data
    public Cl76a(int Num) {
        myNum = Num;
        myEnd1 = 0;
        myEnd2 = 0;

    }

    //Mutator: Modifies private data
    public void setStuff() {
        myEnd1 = myNum * 9;
        myEnd2 = myEnd1 * 12345679;

    }

    //Accessors: returns private data

    public int getEnd1() {
        return myEnd1;
    }

    public int getEnd2() {
        return myEnd2;
    }
}
/* Class
 * private data
 * constructors
 * modifiers (mutators)
 * accessors
 */
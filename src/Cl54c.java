public class Cl54c {
    //Private Data (fields)
    private double myRad;
    private double myArea;
    private double myCirc;
    private double myPi;


    //Constructor: Sets private data
    public Cl54c(double Rad) {
        myRad = Rad;
        myArea = 0;
        myCirc = 0;
        myPi = 0;
    }

    //Mutator: Modifies private data
    public void setStuff() {
        myPi = 3.14159;
        myArea = Math.pow(myRad, 2.0) * myPi;
        myCirc = 2.0 * myRad * myPi;

    }

    //Accessors: returns private data

    public double getCirc() {
        return myCirc;
    }

    public double getArea() {
        return myArea;
    }
}
/* Class
 * private data
 * constructors
 * modifiers (mutators)
 * accessors
 */
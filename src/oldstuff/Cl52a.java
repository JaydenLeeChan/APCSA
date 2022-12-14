package oldstuff;

public class Cl52a {
    //Private Data (fields)
    private int myLen;
    private int myWid;
    private int myArea;
    private int myPerim;

    //Constructor

    /**
     * Returns a new cl52a object
     * @param l length
     * @param w width
     */
    //Constructor: Sets private data
    public Cl52a(int l, int w) {
        myLen = l;
        myWid = w;
        myArea = 0;
        myPerim = 0;
    }

    //Mutator: Modifies private data
    public void setStuff () {
        myArea = myWid * myLen;
        myPerim = 2 * myWid + 2 * myLen;
    }

    //Accessors: returns private data

    /**
     * Retruns the area (length * width)
     * @return the calculated area after calling setStuff()
     */
    public int getArea() { return myArea; }
    public int getPerim() { return myPerim; }
    //Override Method

    public String toString() {
        return String.format("Area: %s\nPerimeter: %s", myArea, myPerim);
    }
    //Easy print method
    public void print() {
        System.out.println(this.toString());
    }
}



/* Class
 * private data
 * constructors
 * modifiers (mutators)
 * accessors
 */
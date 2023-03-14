package Prog702q;

public class Cars extends Vehicle {
    private int myWorth;
    public Cars(String n, int t, int worth) {
        super(n, t);
        myWorth = worth;
    }

    public int getMyWorth() { return myWorth; }
}
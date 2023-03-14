package Prog702q;

public class Trucks extends Vehicle {
        private int myMiles;
    public Trucks(String n, int t, int miles) {
        super(n, t);
        myMiles = miles;
    }

    public int getMyMiles() { return myMiles; }
}
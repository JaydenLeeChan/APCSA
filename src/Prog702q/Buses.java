package Prog702q;

public class Buses extends Vehicle {
    private String myHomeCity;
    public Buses(String n, int t, String mycity) {
        super(n, t);
        myHomeCity = mycity;
    }

    public String getMyHomeCity() { return myHomeCity; }
}

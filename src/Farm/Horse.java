package Farm;

public class Horse extends Animal {
    private int myNumRides;
    private double myRideCost;
    private int myWeight;

    public Horse(String name, int weight, int corn, int hay, int rides, double cost) {
        super(name, weight, corn, hay);
        myNumRides = rides;
        myRideCost = cost;
        myWeight = weight;

    }

    public double value(double cornCost, double hayCost) {
        return myNumRides * myRideCost - getFeedCost(cornCost, hayCost);
    }

    @Override
    public String getName() { return super.getName() + super.getName(); }
    public int getRides() { return myNumRides; }
    public double getRideCost() { return myRideCost; }
    public int getMyWeight() { return myWeight; }
}

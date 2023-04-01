package Farm;

public abstract class Animal {
    private String myName;
    private int myWeight;
    private int myNumCorn;
    private int myNumHayBales;

    public Animal(String name, int weight, int corn, int hay) {
        myName = name;
        myWeight = weight;
        myNumCorn = corn;
        myNumHayBales = hay;
    }

    public abstract double value(double cornCost, double hayCost);

    public String getName() { return myName; }
    public int getMyWeight() { return myWeight; }
    public int getNumCorn() { return myNumCorn; }
    public int getNumHayBales() { return myNumHayBales; }


    public void setMyWeight(int weight) { myWeight = weight; }
    public void setMyNumHayBales (int hayBales) { myNumHayBales = hayBales; }
    public void setMyNumCorn (int hayBales) { myNumCorn = hayBales; }

    public double getFeedCost(double cornCost, double hayCost) {
        return myNumCorn * cornCost + myNumHayBales * hayCost;
    }


}

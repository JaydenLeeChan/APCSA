package Prog703s;

public class Computer implements comps {
    private String myName;
    private int myNumber;
    private double myValue;

    public Computer(String name, int number, double value) {
        myName = name;
        myNumber = number;
        myValue = value;
    }
    public String getName() { return myName; }
    public int getNumber() { return myNumber; }
    public double getValue() { return myValue; }
}

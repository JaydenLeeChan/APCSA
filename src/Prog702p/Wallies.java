package Prog702p;

public class Wallies extends Animal {
        private int mySteps;
    public Wallies(String n, String w, int steps) {
        super(n, w);
        mySteps = steps;
    }

    public int getMySteps() { return mySteps; }
}
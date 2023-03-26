package Prog703s;

public class Windows extends Computer {
    private double myVN;
    public Windows(String name, int num, double value, double VN) {
        super(name, num, value);
        myVN = VN;
    }

    public double getMyVN() { return myVN; }
}
package Prog703s;

public class Linux extends Computer {
    private int myCode;
    public Linux(String name, int num, double value, int code) {
        super(name, num, value);
        myCode = code;
    }

    public int getMyCode() { return myCode; }
}
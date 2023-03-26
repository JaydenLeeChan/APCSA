package Prog703s;

public class Apple extends Computer {
    private String myColor;
    public Apple(String name, int num, double value, String color) {
        super(name, num, value);
        myColor = color;
    }

    public String getMyColor() { return myColor; }
}

package oldstuff;

import java.util.*;

public class Prog54cClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double radius = input.nextDouble();

        Cl54c wow = new Cl54c(radius);
        wow.setStuff();

        double circle = wow.getCirc();
        double area = wow.getArea();

        System.out.println("The Radius of the circle = " + radius);
        System.out.println("The Area of the circle = " + area);
        System.out.println("The Circumference of the circle = " + circle);
    }
}
/*
3.712
The Radius of the circle = 3.712
The Area of the circle = 43.28779268096
The Circumference of the circle = 23.32316416

Process finished with exit code 0

 */
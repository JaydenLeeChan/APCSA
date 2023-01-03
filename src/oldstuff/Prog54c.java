package oldstuff;

import java.util.*;

public class Prog54c {
        public static void main(String[] args) {
            Scanner Input = new Scanner(System.in);

            System.out.println("What is the Radius?");

            double Radius = Input.nextDouble();
            double Pi = 3.14159;
            double Area = Math.pow(Radius, 2.0) * Pi;
            double Circumference = 2.0 * Radius * Pi;

            Radius = Math.round(Radius * 1000.0) / 1000.0;
            Circumference = Math.round(Circumference * 1000.0) / 1000.0;
            Area = Math.round(Area * 1000.0) / 1000.0;

            System.out.println("The Radius of the circle = " + Radius);
            System.out.println("The Area of the circle = " + Area);
            System.out.println("The Circumference of the circle = " + Circumference);
/*
What is the Radius?
9
The Radius of the circle = 9.0
The Area of the circle = 254.469
The Circumference of the circle = 56.549

Process finished with exit code 0
 */
        }
}

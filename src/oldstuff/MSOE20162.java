package oldstuff;

import java.util.*;

public class MSOE20162 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of a?");
        double a = input.nextDouble();
        System.out.println("What is the length of c?");
        double c = input.nextDouble();
        System.out.println("What is the angle of A?");
        double angA = input.nextDouble();

        double sinC = Math.sin(angA)/a * c;

        double angC = Math.asin(sinC);

        System.out.println("The angle C is " + angC + " degrees.");


    }
}
/*
What is the length of a?
3
What is the length of c?
4
What is the angle of A?
0.64
The angle C is 0.9210885077092159 degrees.

Process finished with exit code 0
 */
package oldstuff;

import java.util.*;

public class LP416 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an angle in degrees: ");
        double ang = input.nextDouble();
        ang = Math.toRadians(ang);

        System.out.println("Sine: " + Math.round(Math.sin(ang)*100.0)/100.0);
        System.out.println("Cosine: " + Math.round(Math.cos(ang)*100.0)/100.0);
        System.out.println("Tangent: " + Math.round(Math.tan(ang)*100.0)/100.0);




    }
}
/*
Enter an angle in degrees: 30
Sine: 0.5
Cosine: 0.87
Tangent: 0.58

Process finished with exit code 0

 */
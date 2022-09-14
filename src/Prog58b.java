import java.util.*;

public class Prog58b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is A?");
        double a = input.nextDouble();
        System.out.println("What is B?");
        double b = input.nextDouble();
        System.out.println("What is C?");
        double c = input.nextDouble();

        double root1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2/a);
        double root2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2/a);

        System.out.println("The roots are: " + root1 + "," + root2);
/*
What is A?
1
What is B?
5
What is C?
6
The roots are: -2.0,-3.0

Process finished with exit code 0
 */
    }
}

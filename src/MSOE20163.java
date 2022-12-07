import java.util.Scanner;

public class MSOE20163 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is R1?");
        double r1 = input.nextDouble();

        System.out.println("What is R2?");
        double r2 = input.nextDouble();

        System.out.println("What is the lens thickness(d)?");
        double d = input.nextDouble();

        System.out.println("What is the refractive index(n)?");
        double n = input.nextDouble();

        double tat = n - 1;

        double bruh = tat * ((tat * d / n * r1 * r2) + 1/r1 - 1/r2);

        double f = 1/bruh;

        System.out.println("The focal length is " + f);




    }
}
/*
What is R1?
1
What is R2?
-1
What is the lens thickness(d)?
2
What is the refractive index(n)?
2
The focal length is 1.0
 */
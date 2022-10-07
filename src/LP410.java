import java.util.*;

public class LP410 {
    public static void main(String[] args ) {
        System.out.println("Rectangular Prism");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length: ");
        int l = input.nextInt();
        System.out.print("Enter the width: ");
        int w = input.nextInt();
        System.out.print("Enter the height: ");
        int h = input.nextInt();
        System.out.println("The volume is: " + (l*w*h));
        System.out.println();

        System.out.println("Sphere");
        System.out.print("Enter the radius: ");
        int r = input.nextInt();
        int d = 2*r;
        System.out.println("The volume is: " + Math.round((Math.pow(d, 3) * 3.1415 / 6) * 1000.0)/1000.0);
        System.out.println();

        System.out.println("Cube");
        System.out.print("Enter the length of each side: ");
        int s = input.nextInt();
        System.out.println("The volume is: " + Math.pow(s, 3));


    }
}
/*
Rectangular Prism
Enter the length: 3
Enter the width: 4
Enter the height: 5
The volume is: 60

Sphere
Enter the radius: 3
The volume is: 113.094

Cube
Enter the length of each side: 4
The volume is: 64.0

Process finished with exit code 0
 */
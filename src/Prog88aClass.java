import java.util.*;

public class Prog88aClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();

        Cl88a wow = new Cl88a(x, y);
        wow.setStuff();
        System.out.println("Original Numbers are " + wow.getInt1() + " and " + wow.getInt2());
        System.out.println("Sum = " + wow.getSum());
        System.out.println("Difference = " + wow.getDif());
        System.out.println("Product = " + wow.getProd());
        System.out.println("Average = " + wow.getAvg());
        System.out.println("Absolute Value = " + wow.getDist());
        System.out.println("Maximum = " + wow.getMax());
        System.out.println("Minimum = " + wow.getMin());

    }
}
/*
13
20
Original Numbers are 13.0 and 20.0
Sum = 33.0
Difference = -7.0
Product = 260.0
Average = 16.5
Absolute Value = 7.0
Maximum = 20.0
Minimum = 13.0

Process finished with exit code 0
 */
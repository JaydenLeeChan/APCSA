import java.util.*;

public class LP43 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of eggs purchased: ");
        int c = input.nextInt();
        int egg = c/12;
        int ext = c%12;

        double b = 0;

        if (egg < 4 && egg >= 0) b = 0.5;
        else if (egg >= 4 && egg < 6) b = 0.45;
        else if (egg >= 6 && egg < 11) b = 0.40;
        else if (egg >= 11) b = 0.35;

        double dco = b * egg;
        double rco = ext * b / 12.0;

        System.out.println("The bill is equal to: $" + (dco + rco));


    }
}
/*
Enter the number of eggs purchased: 18
The bill is equal to: $0.75

Process finished with exit code 0

 */
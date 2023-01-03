package oldstuff;

import java.util.*;
import java.io.*;


public class Prog285b {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog285b.dat"));
            System.out.println("Id\t\tCode\tSales\t\tComission");
            while (input.hasNext()) {
                int id = input.nextInt();
                int c = input.nextInt();
                double s = input.nextDouble();

                double com = 0;

                if (c == 5 || c == 8) {
                    if (s <= 5000)
                        com = s * 0.075;
                    else
                        com = 5000 * 0.075 + (s-5000) * 0.085;
                } else if (c == 17) {
                    if (s <= 3500)
                        com = s * 0.095;
                    else
                        com = 3500 * 0.095 + (s - 3500) * 0.12;
                }
                System.out.printf("%d\t\t%d\t\t%.2f\t\t%.2f\n", id, c, s, com);
            }

        }
        catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}

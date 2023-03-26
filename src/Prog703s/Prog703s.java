package Prog703s;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Prog703s {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog703s.txt"));
            //Put code here
            List<Computer> list = new ArrayList<Computer>();

            int greenCount = 0;
            int goldCount = 0;
            int sevenCount = 0;
            int fiveCount = 0;

            while (input.hasNext()) {
                int num = input.nextInt();
                String name = input.next();
                int nu = input.nextInt();
                double val = input.nextDouble();
                if (num == 1) {
                    String color = input.next();
                    Computer p = new Apple(name, nu, val, color);
                    list.add(p);

                    if (color.equals("Green")) greenCount++;
                    if (color.equals("Gold")) goldCount++;
                } else if (num == 2) {
                    double VN = input.nextDouble();
                    Computer p = new Windows(name, nu, val, VN);
                    list.add(p);

                    if (VN == 7) sevenCount++;
                } else if (num == 3) {
                    int code = input.nextInt();
                    Computer p = new Linux(name, nu, val, code);
                    list.add(p);

                    int lastdigit = code % 10;
                    if (lastdigit == 5) fiveCount++;
                }
            }


            //The average number of steps taken by the Wallies is:  63.2
            //The average size of the Beepers words is:  7.25
            System.out.println("Green/Gold Apple Computers: " + (greenCount+goldCount));
            System.out.println("Windows machines on version 7.0: " + sevenCount);
            System.out.println("Linux machines with secret code ending in 5: " + fiveCount);

        }
        catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}

/*
Green/Gold Apple Computers: 1
Windows machines on version 7.0: 2
Linux machines with secret code ending in 5: 4

Process finished with exit code 0
 */
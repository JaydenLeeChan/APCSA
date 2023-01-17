package newstuff;

import java.util.*;
import java.io.*;

public class Prog465b {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog465b.dat"));
            //Put code here

            int[][] m1 = new int[3][4];
            int[][] less = new int[100][2];

            int count = 0;


            System.out.println("Original Table");
            for (int x = 0; x < m1.length; x++) {
                for (int g = 0; g < m1[0].length; g++) {
                    m1[x][g] = input.nextInt();
                    System.out.print(m1[x][g] + "\t");
                    if (m1[x][g] < 100) {
                        less[count][0] = x+1;
                        less[count][1] = g+1;
                        count++;
                    }
                }

                System.out.println();
            }
            System.out.println();


            System.out.println("Row\tColumn");
            for (int x = 0; x < count; x++) {
                for (int g = 0; g < less[0].length; g++) {
                    System.out.print(less[x][g] + "\t");
                }
                System.out.println();
            }
        }
        catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}

/*
Original Table
100	195	182	225
83	125	235	67
129	42	100	750

Row	Column
2	1
2	4
3	2

Process finished with exit code 0
 */
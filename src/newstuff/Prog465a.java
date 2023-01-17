package newstuff;

import java.io.*;
import java.util.*;

public class Prog465a {

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog465a.dat"));
            //Put code here

            int[][] m1 = new int[4][4];
            int[][] m2 = new int[4][4];
            int[][] largest = new int[4][4];


            System.out.println("Matrix 1");
            for (int x = 0; x < m1.length; x++) {
                for (int g = 0; g < m1[0].length; g++) {
                    m1[x][g] = input.nextInt();
                    System.out.print(m1[x][g] + "\t");
                }
                System.out.println();
            }

            System.out.println("Matrix 2");
            for (int x = 0; x < m2.length; x++) {
                for (int g = 0; g < m2[0].length; g++) {
                    m2[x][g] = input.nextInt();
                    System.out.print(m2[x][g] + "\t");
                }
                System.out.println();
            }

            System.out.println("Largest elements");
            for (int x = 0; x < largest.length; x++) {
                for (int g = 0; g < largest[0].length; g++) {
                    largest[x][g] = Math.max(m1[x][g], m2[x][g]);
                    System.out.print(largest[x][g] + "\t");
                }
                System.out.println();
            }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}

/*
Matrix 1
2	7	6	4
6	1	2	4
9	7	2	6
8	3	2	1
Matrix 2
4	1	3	7
6	2	3	8
7	2	2	4
4	2	3	1
Largest elements
4	7	6	7
6	2	3	8
9	7	2	6
8	3	3	1

Process finished with exit code 0
 */
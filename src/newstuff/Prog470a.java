package newstuff;

import java.util.*;
import java.io.*;

public class Prog470a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog464a.dat"));

            int[][] m1 = new int[6][5];

            for (int x = 0; x < m1.length-1; x++) {
                for (int g = 0; g < m1[0].length; g++) {
                    m1[x][g] = input.nextInt();
                    System.out.print(m1[x][g] + "\t");

                }
                System.out.println();
            }

            int rowsum1 = 0;
            for (int l = 0; l < m1.length-1; l++) {
                rowsum1 += m1[l][0];
            }
            m1[5][0] = rowsum1;

            int rowsum2 = 0;
            for (int l = 0; l < m1.length-1; l++) {
                rowsum2 += m1[l][1];
            }
            m1[5][1] = rowsum2;

            int rowsum3 = 0;
            for (int l = 0; l < m1.length-1; l++) {
                rowsum3 += m1[l][2];
            }
            m1[5][2] = rowsum3;

            int rowsum4 = 0;
            for (int l = 0; l < m1.length-1; l++) {
                rowsum4 += m1[l][3];
            }
            m1[5][3] = rowsum4;

            int rowsum5 = 0;
            for (int l = 0; l < m1.length-1; l++) {
                rowsum5 += m1[l][4];
            }
            m1[5][4] = rowsum5;

            for (int r = 0; r < m1[0].length; r++) {
                System.out.print(m1[5][r] + "\t");
            }



        }
        catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}

/*
45	67	89	12	-3
-3	-6	-7	-4	-9
96	81	-8	52	12
14	-7	72	29	-1
19	43	28	63	87
171	178	174	152	86
 */
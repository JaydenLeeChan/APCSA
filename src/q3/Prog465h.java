package q3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Prog465h {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog465h.dat"));
            //Put code here

            while (input.hasNextInt()) {
                System.out.println("Original Matrix");

                int rows = input.nextInt();
                int cols = input.nextInt();

                int[][] ok1 = new int[rows][cols];
                int[][] kk1 = new int[100][3];

                int rowCount = 0;

                int ogVal = 0;
                int spVal = 0;

                for (int lcv = 0; lcv < rows; lcv++) {
                    for (int lcv2 = 0; lcv2 < cols; lcv2++) {
                        ok1[lcv][lcv2] = input.nextInt();
                        System.out.print(ok1[lcv][lcv2] + " ");

                        if (ok1[lcv][lcv2] != 0) {
                            kk1[rowCount][0] = lcv+1;
                            kk1[rowCount][1] = lcv2+1;
                            kk1[rowCount][2] = ok1[lcv][lcv2];
                            rowCount++;
                        }
                    }
                    System.out.println();
                }
                System.out.println();

                ogVal = ok1.length * ok1[0].length;
                spVal = rowCount * 3;

                if (ogVal > spVal) {
                    System.out.println("The Original Matrix is Abundant\n");
                }
                else if (ogVal == spVal) {
                    for (int lcv = 0; lcv < rowCount; lcv++) {
                        for (int lcv2 = 0; lcv2 < 3; lcv2++) {
                            System.out.print(kk1[lcv][lcv2] + " ");
                        }
                        System.out.println();
                    }
                    System.out.println("The Original Matrix and the Sparse Matrix are Equally Efficient\n");
                }
                else {
                    for (int lcv = 0; lcv < rowCount; lcv++) {
                        for (int lcv2 = 0; lcv2 < 3; lcv2++) {
                            System.out.print(kk1[lcv][lcv2] + " ");
                        }
                        System.out.println();
                    }
                    System.out.println("The original Matrix is Sparse\n");
                }
            }


        }
        catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
Original Matrix
0 0 7 0 0 0
0 0 0 0 -8 0
0 0 0 0 0 0
2 0 0 0 0 0
0 0 0 0 0 0

The Original Matrix is Abundant

Original Matrix
0 2 0 3 0 1
8 0 4 0 1 0
0 3 0 1 0 -7
5 0 9 0 6 0
0 2 0 -1 0 7

1 2 2
1 4 3
1 6 1
2 1 8
2 3 4
2 5 1
3 2 3
3 4 1
3 6 -7
4 1 5
4 3 9
4 5 6
5 2 2
5 4 -1
5 6 7
The original Matrix is Sparse

Original Matrix
0 0 1 0 0 2
3 0 0 4 0 0
0 0 5 0 0 6
7 0 0 8 0 0
0 0 9 0 0 1

1 3 1
1 6 2
2 1 3
2 4 4
3 3 5
3 6 6
4 1 7
4 4 8
5 3 9
5 6 1
The Original Matrix and the Sparse Matrix are Equally Efficient


Process finished with exit code 0

 */
package newstuff;
import java.io.*;
import java.util.*;




public class Prog402a {
    public static void main(String[] args) {
        try {

            Scanner input = new Scanner(new File("data/prg402a.dat"));
            //Put code here

            int[] idArray = new int[50];
            int[] scoreArray = new int[50];


            for (int lcv = 0; input.hasNextInt(); lcv++) {
                idArray[lcv] = input.nextInt();
                scoreArray[lcv] = input.nextInt();

            }

            Cl402a test = new Cl402a();
            test.calc(idArray, scoreArray);

            double sum = test.getMySum();
            double avg = test.getMyAvg();

            double[] diffArray = new double[50];

            for (int lcv = 0; lcv < scoreArray.length; lcv++) {
                diffArray[lcv] = scoreArray[lcv]-avg;
            }

            System.out.println("ID\tScore\tDiff");

            for (int lcv = 0; lcv < scoreArray.length; lcv++) {
                if (!(idArray[lcv] == 0)) {
                    System.out.print(idArray[lcv] + "\t" + scoreArray[lcv] + "\t");
                    System.out.printf("%.2f", diffArray[lcv]);
                    System.out.println();
                }
            }





        }
        catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
ID	Score	Diff
115	257	14.38
123	253	10.38
116	246	3.38
113	243	0.38
112	239	-3.62
104	239	-3.62
110	238	-4.62
218	243	0.38
208	242	-0.62
222	223	-19.62
223	230	-12.62
213	229	-13.62
207	228	-14.62
203	224	-18.62
305	265	22.38
306	262	19.38
311	256	13.38
325	246	3.38
321	245	2.38
323	245	2.38
301	242	-0.62

Process finished with exit code 0

 */
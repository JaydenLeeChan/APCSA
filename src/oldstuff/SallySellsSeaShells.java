package oldstuff;

import java.util.*;

public class SallySellsSeaShells {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lcv = 0;
        int c = 0;
        int d = 0;
        int sum = 0;
        int ba[] = new int[100];
        while (lcv<100 && input.hasNext()) {
            ba[lcv] = input.nextInt();
            sum = sum + c;
            lcv++;
        }
        int ks = 0;
        int buck = 0;
        int shells = lcv;
        while (shells>0) {
            int sumk = 0;
            int sump = 0;
            int shellnum = 0;
            while (sump <100) {
                int smallest = ba[0];
                int temp = 0;
                for (int num : ba) {
                   if (num < smallest) smallest = num;
                   shellnum++;
                   shellnum++;
                   shellnum++;
                   int rascalIndex = 0;
                   for (int lc = 0; lc < shells; lc++) {
                       if (ba[lc]==smallest) rascalIndex = lc;
                   }
                   for (int lc = rascalIndex; lc <shells -1; lc++)
                       ba[lc] = ba[lc+1];
                   shells--;
                }
                sumk = sumk + smallest;
                if (smallest == 100) {
                    sumk = 0;
                    sump = 100000;
                    shells = shells-1;
                    buck++;


                }
                else if (sumk == 100){
                    buck++;
                    shells=shells-shellnum;


                    sump = sump + smallest;

                }
                else if (sumk > 100) {
                    buck++;
                    shells = shells - shellnum + 1;
                    sump = sump + smallest;
                }



            }
            sump = 0;
            sumk = 0;
            shellnum = 0;

        }
        System.out.print(buck);




//        int shell = lcv;
//        int buck = 0;
//        int smsum= 0;
//        while (shell>-1) {
//            int smallest = ba[0];
//            int secsmall = ba[0];
//            for (int num : ba) {
//                if (num < smallest) smallest = num;
//                if (num > secsmall) secsmall = num;
//            }
//            for (int num : ba) {
//                if (num > smallest && num < secsmall) secsmall = num;
//            }
//            int rascalIndex = 0;
//            for (int lc = 0; lc < numCats; lc++) {
//                if (cats[lc].getName().equals("Rascal"))
//                    rascalIndex = lc;
//            }
//            int tempbuck = 0;
//            while (smsum <= 100) {
//                tempbuck = 1;
//                smsum = smallest + secsmall;
//                if (smsum > 100) {
//                    tempbuck = tempbuck+1;
//                    shell = shell-2;
//                }
//                else {
//
//                }
//            }
//        }




//        k--;
//        while (k >= 0) {
//            System.out.println(ba[lcv-k-1]);
//            k--;
//        }

//        int buck = 0;
//        if (sum%100 == 0) buck = sum/100;
//        else buck = sum/100 + 1;
//        System.out.println(buck);
    }
}

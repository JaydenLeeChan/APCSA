package Prog295c;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Prog295c {
    public static void main(String[] args) {
        try {
            Scanner input1 = new Scanner(new File("data/merge1.txt"));
            Scanner input2 = new Scanner(new File("data/merge2.txt"));
            //Put code here

            ArrayList<employee> ok1 = new ArrayList<>();
            ArrayList<employee> ok2 = new ArrayList<>();
            ArrayList<employee> okMerge = new ArrayList<>();

            while (input1.hasNext()) {
                String SSN = input1.next();
                String holding = input1.next();
                String cls = holding.substring(0,1);
                String type = holding.substring(1,2);
                int dept = Integer.parseInt(holding.substring(2,3));
                employee x = new employee(SSN, cls, type, dept);
                ok1.add(x);
            }

            while (input2.hasNext()) {
                String SSN = input2.next();
                String holding = input2.next();
                String cls = holding.substring(0,1);
                String type = holding.substring(1,2);
                int dept = Integer.parseInt(holding.substring(2,3));
                employee x = new employee(SSN, cls, type, dept);
                ok2.add(x);
            }

            int count1 = 0;
            int count2 = 0;

            while (count1 < ok1.size() && count2 < ok2.size()) {
                if (ok1.get(count1).getNumerizedSSN() <= ok2.get(count2).getNumerizedSSN()) {
                    okMerge.add(ok1.get(count1));
                    count1++;
                } else {
                    okMerge.add(ok2.get(count2));
                    count2++;
                }
            }

            while (count1 < ok1.size()) {
                okMerge.add(ok1.get(count1));
                count1++;
            }

            while (count2 < ok2.size()) {
                okMerge.add(ok2.get(count1));
                count2++;
            }

            for (employee b : okMerge) System.out.println(b);

        }
        catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}

/*
000-00-0001 A B 1
111-11-1111 A B 1
123-45-6789 C F 5
222-22-2227 D L 9
321-01-2345 A B 1
357-86-4219 C F 5
411-52-9485 D L 9
432-23-3489 A B 1
514-98-1234 A B 1
514-98-5555 C F 5
521-96-8743 C F 5
522-77-8765 C F 5
522-77-8766 C F 5
522-77-8767 C F 5
525-25-2525 A B 1
531-45-9260 C F 5
538-11-1234 D L 9
538-11-1234 D L 9
538-11-1234 D L 9
538-11-1234 D L 9

Process finished with exit code 0

 */
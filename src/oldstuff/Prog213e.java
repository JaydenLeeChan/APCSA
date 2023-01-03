package oldstuff;

import java.util.*;
import java.io.*;

public class Prog213e {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog213e.dat"));

            System.out.println("Langner Family");
            System.out.println("Age  Group    Distribution    Percentage");
            int a = 0;
            int b = 0;
            int c = 0;
            int d = 0;
            int e = 0;
            int k = 0;
            int l = input.nextInt();

            for (k = 1; k < l+1; k++) {
                int id = input.nextInt();
                if (id < 20) a++;
                else if (id >= 20 && id < 40) b++;
                else if (id >= 40 && id < 60) c++;
                else if (id >= 60 && id < 80) d++;
                else e++;
            }
            int guh = a+b+c+d+e;
            System.out.println("<20    " + a + "    " + (double) a/guh);
            System.out.println("20-39    " + b + "    " + (double) b/guh);
            System.out.println("40-59    " + c + "    " + (double) c/guh);
            System.out.println("60-79    " + d + "    " + (double) d/guh);
            System.out.println(">70    " + e + "    " + (double) e/guh);

        }
        catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
Langner Family
Age  Group    Distribution    Percentage
<20    3    0.17647058823529413
20-39    4    0.23529411764705882
40-59    5    0.29411764705882354
60-79    3    0.17647058823529413
>70    2    0.11764705882352941

Process finished with exit code 0

 */
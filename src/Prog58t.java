//kill me now
//-Jayden Chan

import java.util.*;

public class Prog58t {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("how much money cost");
        double pp = input.nextDouble();
        System.out.println("how much money give");
        double r = input.nextDouble();

        double c = r - pp;

        System.out.println("change: " + c);

        int dl = (int) c*100/100;
        System.out.println(dl);
        int qu = (int) c*100/25;
        System.out.println(qu);
        int di = (int) c*100/10;
        System.out.println(di);
        int ni = (int) c*100/5;
        System.out.println(ni);
        int pe = (int) c*100/1;
        System.out.println(pe);

        System.out.println(dl);


    }
}

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

        int dl = c*100/100;
        int qu = c*100/25;
        int di = c*100/10;
        int ni = c*100/5;
        int pe = c*100/1;

        System.out.println(dl);


    }
}

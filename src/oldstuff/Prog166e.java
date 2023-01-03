package oldstuff;

public class Prog166e {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        double c;


        //while (conditional1 && conditional2) are both true...
        //while (conditional1 && conditional2) either one or both are true...
        while (a < 15 && b <= 15) {
            a+= 1;
            if (a == b) {
                b++;
                if (a != 14) {
                    a = 1;
                }
            }
            c = (double) a/b;
            System.out.printf("%d/%d\t\t%.5f\n", a, b, c);
        }
    }
}

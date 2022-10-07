public class Prog122c {
    public static void main(String[] args) {
        int lcv = 0;
        while (lcv < 10) {
            lcv = lcv + 2;
            System.out.println(lcv + "     " + (lcv +1) + "     " + (lcv * 2) + "     " + Math.pow(lcv, 2));
        }
    }
}
/*
2     3     4     4.0
4     5     8     16.0
6     7     12     36.0
8     9     16     64.0
10     11     20     100.0

Process finished with exit code 0
 */
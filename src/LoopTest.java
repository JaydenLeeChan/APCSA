public class LoopTest {
    public static void main(String[] args) {
        int lcv = 1;
        while (lcv <= 10) {
            System.out.print(lcv + " ");
            lcv++;
        }
        System.out.println();

        //only use for loops with loops that have a counter
        for (int lcv2 = 1; lcv2 <= 10; lcv2++) {
            System.out.println(lcv2 + " ");
        }
        System.out.println();

    }
}

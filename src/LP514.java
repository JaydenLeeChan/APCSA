public class LP514 {
    public static void main(String[] args) {
        System.out.println("Dice 1     Dice 2     Total");
        int lcv = 0;
        int f;
        int s;
        int t;
        while (lcv < 5) {
            s = ((int)(Math.random() * (6 - 1) + 1));
            f = ((int)(Math.random() * (6 - 1) + 1));
            t = f + s;
            System.out.println(  s + "          " + f + "          " + t   );
            lcv++;
        }
    }
}
/*
Dice 1     Dice 2     Total
2          1          3
1          3          4
4          2          6
5          4          9
2          1          3

Process finished with exit code 0

 */
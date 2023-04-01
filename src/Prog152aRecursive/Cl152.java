package Prog152aRecursive;

public class Cl152 {
    public Cl152() {

    }
    public static int sum(int start, int end) {
        if (start > end) {
            return 0;
        } else {
            return start + sum(start + 3, end);
        }
    }
}

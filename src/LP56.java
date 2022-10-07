import java.util.*;

public class LP56 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int m = input.nextInt();
        int k = 0;
        int c = 0;
        String l = String.valueOf(m);
        int lcv = 0;
        while (lcv < l.length()) {
            k = Integer.parseInt(String.valueOf(l.charAt(lcv)));
            c = c + k;
            k++;
            lcv++;
        }
        System.out.print("The sum of the digits is: " + c);

    }
}
/*
Enter a positive integer: 892
The sum of the digits is: 19
Process finished with exit code 0

 */
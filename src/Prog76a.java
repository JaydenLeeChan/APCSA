import java.util.*;

public class Prog76a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number you dislike: ");
        int bad = input.nextInt();
        System.out.println("         " + bad);
        System.out.println("       X " + "9");
        System.out.println("__________");
        String space = "        ";
        if (bad * 9 < 9)
            space = "         ";
        System.out.println(space + bad * 9);
        System.out.println("X 12345679");
        System.out.println("__________");
        System.out.print(bad * 9 * 12345679 + " Surprise!");
    }
}
/*
Enter a number you dislike: 5
         5
       X 9
__________
        45
X 12345679
__________
555555555 Surprise!
Process finished with exit code 0
 */
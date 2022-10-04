import java.util.*;

public class Prog76a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number you dislike: ");
        int bad = input.nextInt();
        System.out.println("         " + bad);
        System.out.println("       X " + "9");
        System.out.println("__________");
        System.out.println("        " + bad * 9);
    }
}

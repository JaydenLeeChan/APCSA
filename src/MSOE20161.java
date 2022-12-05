import java.util.*;

public class MSOE20161 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your word?");
        String bruh = input.nextLine();
        boolean ok = true;
        boolean bok = true;
        for (int lcv = 0; lcv <= bruh.length()/2; lcv++) {
            if (!(bruh.substring(lcv).equals(bruh.substring(bruh.length()-1-lcv)))) {
                ok = false;
                lcv = 999999;
            }

        }
        if (ok) System.out.println("Your word is a palindrome.");
        if (ok == false) System.out.println("Your word is not palindrome.");
    }
}

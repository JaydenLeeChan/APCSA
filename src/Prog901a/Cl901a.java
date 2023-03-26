package Prog901a;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
public class Cl901a {

    public Cl901a() {
    }
    public static void printFile(Scanner input) {
        ArrayList<String> ok = new ArrayList<>();
        while (input.hasNextLine()) {
            String line = input.nextLine();
            ok.add(line);
            System.out.println(line);
        }
        System.out.println();

        for (String b : ok) {
            System.out.println(reverseString(b));
        }
    }

    public static String reverseString(String s) {
        if (s.length() <=1) {
            return s;
        } else {
            return reverseString(s.substring(1)) + s.charAt(0);
        }
    }

}

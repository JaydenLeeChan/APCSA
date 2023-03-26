package q3;

import java.io.*;
import java.util.*;

public class Prog910b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        System.out.print("Enter a base 10 number: ");
        int num = input.nextInt();

        System.out.print("Enter the target base: ");
        int targetBase = input.nextInt();
        Cl910b ok = new Cl910b(num, targetBase);
        System.out.println(ok.convertToBase(num, targetBase));


    }
}
/*
Enter a base 10 number: 255
Enter the target base: 16
FF
 */
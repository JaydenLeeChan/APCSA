package q3;

import java.util.Scanner;

public class Prog607a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cl607a lmao = new Cl607a();

        System.out.println("-----menu-----");
        System.out.println("0) Quit\n" +
                "1) Encode Date\n" +
                "2) Decode Date\n" +
                "Select an option ");

        if (input.nextInt() == 1) {
            System.out.println("Enter date (m/d/y)");
            System.out.println("The code is: " + lmao.getEncode(input.next()));
        }
        else {
            System.out.println("The date is: " + lmao.getDecode(input.next()));
        }


    }
}
/*
-----menu-----
0) Quit
1) Encode Date
2) Decode Date
Select an option
2
KORH
The date is: 11/02/1989

Process finished with exit code 0
 */
package oldstuff;

import java.util.Scanner;
//Jayden Chan
//9/28/2022
//String Interview Question 7
public class StrInterview7 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String mytext = keyboard.nextLine();

        int vowelcount = 0;
        for (int lcv = 0; lcv < mytext.length(); lcv++) {
            char cur = mytext.charAt(lcv);
            if (cur == 'a' || cur == 'e' || cur == 'i' || cur == 'o' || cur == 'u')
                vowelcount++;
        }
        int conscount = mytext.length() - vowelcount;
        System.out.printf("# Vowels: %d\t\t# Consonants: %d\n", vowelcount, conscount);

    }

}
/*
Enter a string: beautiful
# Vowels: 5		# Consonants: 4

Process finished with exit code 0

 */
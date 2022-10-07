import java.util.*;

public class LP42 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int kl = 0;
        int lcm = 0;
        int wcm = 0;
        int hcm = 0;

        System.out.print("Enter package weight in kilograms: " );
        kl = input.nextInt();

        System.out.print("Enter package length in centimeters: " );
        lcm = input.nextInt();

        System.out.print("Enter package width in centimeters: " );
        wcm = input.nextInt();

        System.out.print("Enter package height in centimeters: " );
        hcm = input.nextInt();

        int cbcm = lcm * wcm * hcm;

        if (cbcm > 100000 && kl > 27) System.out.println("Too heavy and too large.");
        else if (cbcm > 100000) System.out.println("Too large.");
        else if (kl > 27) System.out.println("Too heavy.");
        else System.out.println("ur good bruh");
    }
}
/*
Enter package weight in kilograms: 32
Enter package length in centimeters: 30
Enter package width in centimeters: 25
Enter package height in centimeters: 38
Too heavy.

Process finished with exit code 0
 */
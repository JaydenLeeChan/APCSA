import java.util.*;

public class LP41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of copies to be printed: ");
        double cp = input.nextDouble();
        double b = 0;
        if (cp < 100) {
            System.out.println("Price per copy is: $0.30");
            b=0.3;
        }
        else if (cp < 500) {
            System.out.println("Price per copy is: $0.28");
            b=0.28;
        }
        else if (cp < 750) {
            System.out.println("Price per copy is: $0.27");
            b=0.27;
        }
        else if (cp < 1000) {
            System.out.println("Price per copy is: $0.26");
            b=0.26;
        }
        else {
            System.out.println("Price per copy is: $0.25");
            b=0.25;
        }
        System.out.println("Total cost is: $" + cp * b);

    }
}
/*
Enter the number of copies to be printed: 1001
Price per copy is: $0.25
Total cost is: $250.25

Process finished with exit code 0
*/

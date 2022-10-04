import java.util.*;

public class Prog82a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the speed limit: ");
        int sl = input.nextInt();
        System.out.print("Enter the vehicle speed: ");
        int vs = input.nextInt();
        double fine = 20 + ((vs - sl) * 5);
        System.out.print("Fine-----------------------$" + fine);

    }
}
/*
Enter the speed limit: 55
Enter the vehicle speed: 70
Fine-----------------------$95.0
Process finished with exit code 0
 */
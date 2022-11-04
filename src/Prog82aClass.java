import java.util.*;

public class Prog82aClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the speed limit: ");
        int sl = input.nextInt();
        System.out.print("Enter the vehicle speed: ");
        int vs = input.nextInt();

        Cl82a wow = new Cl82a(sl, vs);
        wow.setStuff();


        System.out.print("Fine-----------------------$" + wow.getFine());
    }
}

/*
Enter the speed limit: 30
Enter the vehicle speed: 42
Fine-----------------------$80.0
Process finished with exit code 0
 */
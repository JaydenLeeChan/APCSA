import java.util.*;

public class Prog213fClass {
    //Driver Program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Cl213f wow = new Cl213f(input.nextDouble());
        wow.setStuff();

        System.out.println("The cost of " + wow.getKwh() + " KWH is $" + wow.getCost());
    }
}
/*
1338
The cost of 1338.0 KWH is $93.66

Process finished with exit code 0

 */
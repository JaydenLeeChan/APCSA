import java.util.*;

public class Prog58i {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("The amount I wish to borrow is $");
        double p = input.nextDouble(); //principal

        System.out.println("The loan rate is ");
        double r = input.nextDouble(); //rate

        System.out.println("The number of months it will take me to pay off the loan is ");
        double m = input.nextDouble(); //months

        double ro12 = r/1200;
        double mp = p * (ro12 * (Math.pow(m, (1 + ro12))/(Math.pow(m, (1 + ro12))-1)));

        System.out.printf("My monthly payments will be $%.2f\n", mp);
        System.out.printf("The total interest paid is $%.2f\n", mp * m);
        System.out.printf("The total amount paid is $%.2f\n", ((mp * m) +p));
    }
}

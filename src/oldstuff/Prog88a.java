package oldstuff;// Jayden Chan
// 9/12/22
// Prog88a

public class Prog88a {
    public static void main(String[] args) {

        // Enter number 1-13
        // Enter number 2-28

        int num1 = (int) (Math.random() * (13-1)) + 1;
        int num2 = (int) (Math.random() * (20-2)) + 2;

        System.out.println("Original Numbers are " + num1 + " and " + num2);

        int sum = num1 + num2;
        int dif = num1 - num2;
        int prod = num1 * num2;

        double avg = sum / 2.0;

        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + dif);
        System.out.println("Product = " + prod);
        System.out.println("Average = " + avg);
        System.out.println("Absolute Value = " + Math.abs(dif));

        int max;

        if (num1 > num2) {
            max = num1;
        } else {
            max = num2;
        }

        int min;

        if(max == num1) {
            min = num2;
        } else {
            min = num1;
        }
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);



    }
}
/*
Original Numbers are 9 and 11
Sum = 20
Difference = -2
Product = 99
Average = 10.0
Absolute Value = 2
Maximum = 11
Minimum = 9

Process finished with exit code 0
*/

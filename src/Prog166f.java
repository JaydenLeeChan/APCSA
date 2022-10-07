public class Prog166f {
    public static void main(String[] args) {
         int lcv = 99;
         int k = 0;
         int b = 0;
         while (lcv < 110) {
             lcv++;
             while (k < lcv) {
                 k++;
                 b = b + k;
             }
             System.out.println("The sum of the numbers from 1 to " + lcv + " is " + b);
             k = 0;
             b = 0;
         }
    }
}
/*
The sum of the numbers from 1 to 100 is 5050
The sum of the numbers from 1 to 101 is 5151
The sum of the numbers from 1 to 102 is 5253
The sum of the numbers from 1 to 103 is 5356
The sum of the numbers from 1 to 104 is 5460
The sum of the numbers from 1 to 105 is 5565
The sum of the numbers from 1 to 106 is 5671
The sum of the numbers from 1 to 107 is 5778
The sum of the numbers from 1 to 108 is 5886
The sum of the numbers from 1 to 109 is 5995
The sum of the numbers from 1 to 110 is 6105

Process finished with exit code 0

 */
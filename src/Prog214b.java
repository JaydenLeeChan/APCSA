import java.util.*;
import java.io.*;


public class Prog214b {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog214b.dat"));
            //Put code here
            while (input.hasNextLine()) {
                double empnum = input.nextDouble();
                double ytdpay = input.nextDouble();
                double basepayrate = input.nextDouble();
                double shiftfactor = input.nextDouble();
                double hoursworked = input.nextDouble();

                double grosspay = hoursworked * basepayrate * shiftfactor;

                double taxrate = 0.0;
                if (grosspay < 100) taxrate = 0.0;
                else if (grosspay < 150) taxrate = 0.08;
                else if (grosspay < 200) taxrate = 0.12;
                else if (grosspay < 300) taxrate = 0.15;
                else taxrate = 0.175;

                double withholdtax = grosspay * taxrate;

                double ficatax = 0;
                if (ytdpay > 17300) ficatax = 0;
                if (ytdpay <= 17300) ficatax = 0.0605 * grosspay;
                if (ytdpay < 17300 && ytdpay + grosspay > 17300) ficatax = 0.0605 * (ytdpay + grosspay - 17300);

                double netpay = grosspay - withholdtax - ficatax;

                System.out.println("Employee Number: " + (int) empnum);
                System.out.println("Hours: " + hoursworked);
                System.out.println("Rate: $" + basepayrate);
                System.out.println("Shift Factor: " + shiftfactor);
                System.out.println("YTD Pay: $" + ytdpay);
                System.out.println("Gross Pay: $" + grosspay);
                System.out.println("Withholding Tax: $" + withholdtax);
                System.out.println("FICA Tax: $" + ficatax);
                System.out.println("Net Pay: $" + empnum);
                System.out.println();
                System.out.println();

            }

        }
        catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
Employee Number: 1001
Hours: 34.5
Rate: $4.5
Shift Factor: 1.25
YTD Pay: $1056.1
Gross Pay: $194.0625
Withholding Tax: $23.287499999999998
FICA Tax: $11.74078125
Net Pay: $1001.0


Employee Number: 1002
Hours: 25.0
Rate: $3.25
Shift Factor: 1.0
YTD Pay: $3970.0
Gross Pay: $81.25
Withholding Tax: $0.0
FICA Tax: $4.9156249999999995
Net Pay: $1002.0


Employee Number: 1003
Hours: 30.0
Rate: $4.0
Shift Factor: 1.0
YTD Pay: $12485.5
Gross Pay: $120.0
Withholding Tax: $9.6
FICA Tax: $7.26
Net Pay: $1003.0


Employee Number: 1004
Hours: 38.5
Rate: $5.25
Shift Factor: 1.5
YTD Pay: $15587.4
Gross Pay: $303.1875
Withholding Tax: $53.0578125
FICA Tax: $18.34284375
Net Pay: $1004.0


Employee Number: 1005
Hours: 40.0
Rate: $6.25
Shift Factor: 1.0
YTD Pay: $17188.5
Gross Pay: $250.0
Withholding Tax: $37.5
FICA Tax: $8.379249999999999
Net Pay: $1005.0


Employee Number: 1006
Hours: 48.0
Rate: $8.95
Shift Factor: 1.5
YTD Pay: $19109.4
Gross Pay: $644.4
Withholding Tax: $112.76999999999998
FICA Tax: $0.0
Net Pay: $1006.0


Employee Number: 1007
Hours: 35.0
Rate: $5.0
Shift Factor: 1.5
YTD Pay: $15600.0
Gross Pay: $262.5
Withholding Tax: $39.375
FICA Tax: $15.88125
Net Pay: $1007.0
 */
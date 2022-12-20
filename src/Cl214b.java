import java.io.File;
import java.util.*;

public class Cl214b {
    private double empnum = 0;
    private double ytdpay = 0;
    private double basepayrate = 0;
    private double shiftfactor = 0;
    private double hoursworked = 0;

    public Cl214b (double Xempnum, double Xytdpay, double Xbasepayrate, double Xshiftfactor, double Xhoursworked) {
        empnum = Xempnum;
        ytdpay = Xytdpay;
        basepayrate = Xbasepayrate;
        shiftfactor = Xshiftfactor;
        hoursworked = Xhoursworked;
    }

    public void outputthestuff() {

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

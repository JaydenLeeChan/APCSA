import java.sql.Array;
import java.util.*;
import java.io.*;


public class Prog602b {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog602b.dat"));
            //Put code here
            ArrayList<InternetCustomer> list = new ArrayList<InternetCustomer>();
            while (input.hasNext()) {
                int id = input.nextInt();
                double hours = input.nextDouble();
                int code = input.nextInt();

                InternetCustomer fred = new InternetCustomer(id, hours, code);
                list.add(fred);
            }
            for (int lcv = 0; lcv < list.size(); lcv++) {
                InternetCustomer current = list.get(lcv);
                current.setCharge();
            }

            System.out.println("Account #\t\tHours\t\tCode\t\tAmount Due");
            for (InternetCustomer me : list) {
                System.out.println(me.getAcc() + "\t\t" +
                        me.getHours() + "\t\t" + me.getCode() + "\t\t" + me.getCharge());
            }

        }
        catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}

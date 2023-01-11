package newstuff;

import java.util.*;
import java.io.*;


public class Prog435a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog435a.dat"));
            //Put code here

            while (input.hasNextLine()) {
                int a = input.nextInt();
                int b = input.nextInt();

                Cl435a bruh = new Cl435a(a, b);
                bruh.setCar();
                bruh.setGate();
                System.out.println(bruh.getMycarType() + "\t$" + bruh.getMygateToll() + "\t"
                + bruh.getMycarFactor() + "\t$" + bruh.getMycarFactor()*bruh.getMygateToll());



            }

        }
        catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
Compact Car	$1.35	1.0	$1.35
Small Care	$2.5	1.3	$3.25
Mid Size Care	$4.1	1.6	$6.56
Full Size Car	$5.5	2.0	$11.0
Truck	$2.0	2.4	$4.8
16 Wheeler	$3.25	2.7	$8.775
Compact Car	$4.8	1.0	$4.8
Small Care	$6.0	1.3	$7.800000000000001
Mid Size Care	$1.35	1.6	$2.16
Full Size Car	$2.5	2.0	$5.0
Truck	$4.1	2.4	$9.839999999999998
16 Wheeler	$5.5	2.7	$14.850000000000001
Compact Car	$6.0	1.0	$6.0
Small Care	$1.35	1.3	$1.7550000000000001
Mid Size Care	$2.0	1.6	$3.2
Full Size Car	$2.5	2.0	$5.0
Truck	$3.25	2.4	$7.8
16 Wheeler	$4.1	2.7	$11.07
 */
package newstuff;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog215i {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog215i.dat"));
            //Put code here

            Cl215i[] vehicleArray = new Cl215i[50];
            int counter = 0;
            for(int lcv = 0; lcv<10; lcv++) {
                int id = input.nextInt();
                double gallons = input.nextDouble();
                double miles = input.nextDouble();

                if(id>0 && miles>0 && gallons>0) {
                    double MPG = Math.round(miles/gallons*10.0)/10.0;
                    vehicleArray[counter] = new Cl215i(id, miles, gallons, MPG);
                    counter++;
                }
            }
            System.out.println("Vehicle\t\tMiles\t\tGallons\t\tMPG");
            for(int lcv = 0; lcv<counter; lcv++) {
                System.out.println(vehicleArray[lcv].toString());
            }

            System.out.println();
            System.out.println();
            System.out.println();

            System.out.println("MPG Statistics:");


            int bestID = vehicleArray[0].getMyVehicleID();
            for (int lcv = 1; lcv<counter; lcv++) {
                if(vehicleArray[lcv].getMyMPG()>vehicleArray[lcv-1].getMyMPG()) {
                    bestID = vehicleArray[lcv].getMyVehicleID();
                }
            }
            System.out.println("Best: " + bestID);

            double worstMPG = Double.MAX_VALUE;
            int worstID = vehicleArray[0].getMyVehicleID();
            for (int lcv = 1; lcv<counter; lcv++) {
                if(vehicleArray[lcv].getMyMPG()<worstMPG) {
                    worstID = vehicleArray[lcv].getMyVehicleID();
                    worstMPG = vehicleArray[lcv].getMyMPG();
                }
            }
            System.out.println("Worst: " + worstID);

            double fleetAVG = 0;
            for (int lcv = 0; lcv<counter; lcv++) {
                fleetAVG += vehicleArray[lcv].getMyMPG();
            }
            fleetAVG /= counter;
            System.out.println("Fleet Average: " + Math.round(fleetAVG*10.0)/10.0);

            System.out.println("Number of Vehicles: " + counter);


        }
        catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}

/*
Vehicle		Miles		Gallons		MPG
1005		380.5		15.0		25.4
1003		240.1		12.0		20.0
1006		172.3		9.0		19.1
1008		317.7		14.0		22.7
1010		390.2		17.0		23.0
1015		152.1		4.0		38.0
1017		310.0		12.3		25.2
1020		409.9		17.9		22.9



MPG Statistics:
Best: 1015
Worst: 1006
Fleet Average: 24.5
Number of Vehicles: 8

Process finished with exit code 0

 */
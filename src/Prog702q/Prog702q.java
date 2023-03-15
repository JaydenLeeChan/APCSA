package Prog702q;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Prog702q {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog702q.txt"));
            //Put code here
            List<Vehicle> list = new ArrayList<Vehicle>();


            int count = 0;
            int totalCarsWorth = 0;
            double totalTrucksWorth = 0;
            int totalBusesWorth = 0;

            int longestBusNameLength = 0;
            String longestBusName = "";

            double minTrucksWorth = Double.MAX_VALUE;
            String leastTruck = "";

            int totalCarsTires = 0;
            int totalTrucksTires = 0;
            int totalBusesTires = 0;

            while (input.hasNext()) {
                int num = input.nextInt();
                String n = input.next();
                int t = input.nextInt();
                if (num == 1) {
                    int worth = input.nextInt();
                    Vehicle p = new Cars(n, t, worth);
                    list.add(p);
                    totalCarsWorth += worth;

                    totalCarsTires += t;
                } else if (num == 2) {
                    int mileage = input.nextInt();
                    Vehicle p = new Trucks(n, t, mileage);
                    list.add(p);

                    double trucksWorth = 50000.00-(0.25*mileage);
                    totalTrucksWorth += trucksWorth;

                    if (trucksWorth < minTrucksWorth) {
                        leastTruck = n;
                    }

                    totalTrucksTires += t;
                } else if (num == 3) {
                    String HomeTown = input.next();
                    Vehicle p = new Buses(n, t, HomeTown);
                    list.add(p);
                    totalBusesWorth += 50000;

                    if (HomeTown.length() > longestBusNameLength) {
                        longestBusName = HomeTown;
                    }

                    totalBusesTires += t;
                }
                count++;
            }


            //The average number of steps taken by the Wallies is:  63.2
            //The average size of the Beepers words is:  7.25
            System.out.println("Total Vehicles: " + count);
            System.out.println("Total Worth of All Cars: $" + (double) totalCarsWorth);
            System.out.println("Total Worth of All Vehicles $" + (totalBusesWorth+totalTrucksWorth+totalCarsWorth));
            System.out.println("Longest Home Destination Name: " + longestBusName);
            System.out.println("Truck With the Least Value: " + leastTruck);
            System.out.println("Total Car Tires: " + totalCarsTires);
            System.out.println("Total Truck Tires: " + totalTrucksTires);
            System.out.println("Total Bus Tires: " + totalBusesTires);

        }
        catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}

/*
Total Vehicles: 13
Total Worth of All Cars: $33950.0
Total Worth of All Vehicles $428199.75
Longest Home Destination Name: GreenBay
Truck With the Least Value: Softy
Total Car Tires: 15
Total Truck Tires: 95
Total Bus Tires: 69

Process finished with exit code 0
 */
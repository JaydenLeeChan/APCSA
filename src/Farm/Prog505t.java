package Farm;

import java.io.File;
import java.io.IOException;
import java.util.*;


public class Prog505t {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog505w.dat"));
            //Put code here
            List<Animal> animals = new ArrayList<Animal>();

            int hay = input.nextInt();
            double hayCost = input.nextDouble();
            int corn = input.nextInt();
            double cornCost = input.nextDouble();
            Farm bruh = new Farm(hay, corn, hayCost, cornCost);

            int cowRows = input.nextInt();
            int cowPens = input.nextInt();
            for (int r = 0; r < cowRows; r++) {
                for (int p = 0; p < cowPens; p++) {
                    String name = input.next();
                    int weight = input.nextInt();
                    int milk = input.nextInt();
                    int hayEaten = input.nextInt();
                    int cornEaten = input.nextInt();
                    Cow wow = new Cow(name, weight, milk, hayEaten, cornEaten);
                    animals.add(wow);
                    hay -= hayEaten;
                    corn -= cornEaten;
                }
            }

            int horseRows = input.nextInt();
            int horsePens = input.nextInt();
            for (int r = 0; r < horseRows; r++) {
                for (int p = 0; p < horsePens; p++) {
                    String name = input.next();
                    int weight = input.nextInt();
                    int hayEaten = input.nextInt();
                    int cornEaten = input.nextInt();
                    int rides = input.nextInt();
                    double rideCost = input.nextDouble();
                    Horse fred = new Horse(name, weight, hayEaten, cornEaten, rides, rideCost);
                    animals.add(fred);
                    hay -= hayEaten;
                    corn -= cornEaten;
                }
            }

            // ...
            double Income = 0;
            for (int lcv = 0; lcv < animals.size(); lcv++) {
                if (animals.get(lcv) instanceof Horse) {
                    Horse horse = (Horse) animals.get(lcv);
                    Income += horse.value(cornCost, hayCost);
                }
                if (animals.get(lcv) instanceof Cow) {
                    Cow cow = (Cow) animals.get(lcv);
                    Income += cow.value(cornCost, hayCost);
                }
            }
            System.out.println("Income of the day: " + Income);



            double Weight = 0;
            for (int lcv = 0; lcv < animals.size(); lcv++) {
                Weight += animals.get(lcv).getMyWeight();
            }
            System.out.println("Cumulative weight: " + Weight);

            int balesNeeded = 0;
            for (int lcv = 0; lcv < animals.size(); lcv++) {
                balesNeeded += animals.get(lcv).getNumHayBales();
            }
            if (balesNeeded < hay) {
                System.out.println("There is not enough food");
            }
            if (balesNeeded > hay) {
                System.out.println("There is enough food");
                bruh.feedAllAnimals();
                System.out.println("Haybales: " + bruh.getMyHayBales());
                System.out.println("Corn cobs: " + bruh.getMyCorn());
            }
            System.out.println("Cost of feeding: " + balesNeeded*hayCost);

            double minHorse2 = Double.MAX_VALUE;
            int minHorseIndex2 = 0;
            for (int lcv = 0; lcv < animals.size(); lcv++) {
                if  (animals.get(lcv) instanceof Horse) {
                    Horse horse = (Horse) animals.get(lcv);
                    if (horse.value(cornCost, hayCost) < minHorse2) {
                        minHorse2 = horse.value(cornCost, hayCost);
                        minHorseIndex2 = lcv;
                    }
                }
            }
            animals.remove(minHorseIndex2);
            double minHorse1 = Double.MAX_VALUE;
            int minHorseIndex1 = 0;
            for (int lcv = 0; lcv < animals.size(); lcv++) {
                if  (animals.get(lcv) instanceof Horse) {
                    Horse horse = (Horse) animals.get(lcv);
                    if (horse.value(cornCost, hayCost) < minHorse1) {
                        minHorse1 = horse.value(cornCost, hayCost);
                        minHorseIndex1 = lcv;
                    }
                }
            }
            animals.remove(minHorseIndex1);




            double minCow1 = Double.MAX_VALUE;
            int minCowIndex1 = 0;
            for (int lcv = 0; lcv < animals.size(); lcv++) {
                if  (animals.get(lcv) instanceof Cow) {
                    Cow cow = (Cow) animals.get(lcv);
                    if (cow.value(cornCost, hayCost) < minCow1) {
                        minCow1 = cow.value(cornCost, hayCost);
                        minCowIndex1 = lcv;
                    }
                }
            }
            animals.remove(minCowIndex1);
            double minCow2 = Double.MAX_VALUE;
            int minCowIndex2 = 0;
            for (int lcv = 0; lcv < animals.size(); lcv++) {
                if  (animals.get(lcv) instanceof Cow) {
                    Cow cow = (Cow) animals.get(lcv);
                    if (cow.value(cornCost, hayCost) < minCow2) {
                        minCow2 = cow.value(cornCost, hayCost);
                        minCowIndex2 = lcv;
                    }
                }
            }
            animals.remove(minCowIndex2);
            double minCow3 = Double.MAX_VALUE;
            int minCowIndex3 = 0;
            for (int lcv = 0; lcv < animals.size(); lcv++) {
                if  (animals.get(lcv) instanceof Cow) {
                    Cow cow = (Cow) animals.get(lcv);
                    if (cow.value(cornCost, hayCost) < minCow3) {
                        minCow3 = cow.value(cornCost, hayCost);
                        minCowIndex3 = lcv;
                    }
                }
            }
            animals.remove(minCowIndex3);


            for (int lcv = 0; lcv < animals.size(); lcv++) {
                if (animals.get(lcv) instanceof Cow) {
                    animals.get(lcv).setMyWeight(1250);
                    ((Cow) animals.get(lcv)).setMyMilk(80);
                    animals.get(lcv).setMyNumHayBales(3);
                    animals.get(lcv).setMyNumCorn( 4);


                }
            }
            int numcow = 0;
            int numhorse = 0;
            for (int lcv = 0; lcv < animals.size(); lcv++) {
                if (animals.get(lcv) instanceof Horse) {
                    numhorse++;
                }
                if (animals.get(lcv) instanceof Cow) {
                    Cow cow = (Cow) animals.get(lcv);
                    numcow++;
                }
            }
            System.out.println("Cow: " + numcow + "Horse: " + numhorse);





        }
        catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
Income of the day: 190.0
Cumulative weight: 32790.0
There is not enough food
Cost of feeding: 139.5
Cow: 9Horse: 10

 */
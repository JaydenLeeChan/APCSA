package Farm;

import java.io.File;
import java.io.IOException;
import java.util.*;


public class Prog505w {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog505w.dat"));
            //Put code here
            List<Animal> animals = new ArrayList<Animal>();

            int hay = input.nextInt();
            double hayCost = input.nextDouble();
            int corn = input.nextInt();
            double cornCost = input.nextDouble();

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
            }

            double minHorse = Double.MAX_VALUE;
            int minHorseIndex = 0;
            for (int lcv = 0; lcv < animals.size(); lcv++) {
                if  (animals.get(lcv) instanceof Horse) {
                    Horse horse = (Horse) animals.get(lcv);
                    if (horse.value(cornCost, hayCost) < minHorse) {
                        minHorse = horse.value(cornCost, hayCost);
                        minHorseIndex = lcv;
                    }
                }
            }

            System.out.printf("Horse %s makes the least money\n", animals.get(minHorseIndex).getName());

            double maxCow = 0.0;
            int maxCowIndex = 0;
            for (int lcv = 0; lcv < animals.size(); lcv++) {
                if  (animals.get(lcv) instanceof Cow) {
                    Cow cow = (Cow) animals.get(lcv);
                    if (cow.value(cornCost, hayCost) > maxCow) {
                        maxCow = cow.value(cornCost, hayCost);
                        maxCowIndex = lcv;
                    }
                }
            }

            System.out.printf("Cow %s makes the least money\n", animals.get(maxCowIndex).getName());

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
Horse JohnJohn makes the least money
Cow Barb makes the least money

Process finished with exit code 0
 */
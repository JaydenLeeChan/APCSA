package Farm;
import java.io.*;
import java.util.*;

public class Farm implements IFarm {
    private ArrayList<Horse> myHorses;
    private ArrayList<Cow> myCows;
    private int myHayBales;
    private int myCorn;
    private double myHayCost;
    private double myCornCost;
    public Farm(int hayBales, int corn, double hayCost, double cornCost) {
        myHayBales = hayBales;
        myCorn = corn;
        myHayCost = hayCost;
        myCornCost = cornCost;
    }
    // feeds all cows where farm has enough food (amount stored in barn decreases)
    private boolean feedCows() {
        int haybales = 0;
        for (int lcv = 0; lcv < myCows.size(); lcv++) {
            haybales += myCows.get(lcv).getNumHayBales();
        }
        myHayBales = myHayBales - (myCows.size() * haybales);
        return false;
    }

    public int getMyHayBales() { return myHayBales; }
    public int getMyCorn() { return myCorn; }

    //feeds all horses where farm has enough food (amount stored in barn decreases)
    private boolean feedHorses() {
        int haybales = 0;
        for (int lcv = 0; lcv < myHorses.size(); lcv++) {
            haybales += myHorses.get(lcv).getNumHayBales();
        }
        myHayBales = myHayBales - (myHorses.size() * haybales);
        return false;
    }

    //feeds all cows and horses where farm has enough food
    public boolean feedAllAnimals() {
        int haybales = 0;
        for (int lcv = 0; lcv < myHorses.size(); lcv++) {
            haybales += myHorses.get(lcv).getNumHayBales();
        }
        myHayBales = myHayBales - (myHorses.size() * haybales);
        for (int lcv = 0; lcv < myCows.size(); lcv++) {
            haybales += myCows.get(lcv).getNumHayBales();
        }
        myHayBales = myHayBales - (myCows.size() * haybales);
        return false;
    }

    // calculates the value of the milk produced by the cows
    //price for each cow’s milk is the same per pound
    private double cowIncome(double perPound) {
        int milkValue = 0;
        for (int lcv = 0; lcv < myCows.size(); lcv++) {
            milkValue += myCows.get(lcv).getMilk() * perPound;
        }
        return milkValue;
    }

    // calculates the value of the rides given by the horses
    //ride value of each horse changes based on the horse
    private double horseIncome() {
        int rideValue = 0;
        for (int lcv = 0; lcv < myHorses.size(); lcv++) {
            rideValue += myHorses.get(lcv).getRides() * myHorses.get(lcv).getRideCost();
        }
        return rideValue;
    }

    //calculates the daily income of the farm
    public double farmIncome() {
        int totalIncome = 0;
        for (int lcv = 0; lcv < myCows.size(); lcv++) {
            totalIncome += myCows.get(lcv).value(myCornCost, myHayCost);
        }
        for (int lcv = 0; lcv < myHorses.size(); lcv++) {
            totalIncome += myHorses.get(lcv).value(myCornCost, myHayCost);
        }
        return totalIncome;
    }

    //calculates the total weight of all of the farm animals
    public int getWeight() {
        int totalWeight = 0;
        for (int lcv = 0; lcv < myCows.size(); lcv++) {
            totalWeight += myCows.get(lcv).getMyWeight();
        }
        for (int lcv = 0; lcv < myHorses.size(); lcv++) {
            totalWeight += myHorses.get(lcv).getMyWeight();
        }
        return totalWeight;
    }

    //calculates the amount of money it will take to feed the animals for the day
    public double getCost() {
        int totalCost = 0;
        for (int lcv = 0; lcv < myCows.size(); lcv++) {
            totalCost += myCows.get(lcv).getFeedCost(myCornCost, myHayCost);
        }
        for (int lcv = 0; lcv < myHorses.size(); lcv++) {
            totalCost += myHorses.get(lcv).getFeedCost(myCornCost, myHayCost);
        }
        return totalCost;
    }

    //returns all of the cows on the farm
    public ArrayList<Cow> getCows() {
        return myCows;
    }

    //returns all of the horses on the farm
    public ArrayList<Horse> getHorses() {
        return myHorses;
    }
}


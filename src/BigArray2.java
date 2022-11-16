import java.io.*;
import java.util.*;


public class BigArray2 {
    public static void main(String[] args) {
        try {
            //Put code here
            Scanner input = new Scanner(new File("data/bigarraylist.date"));
            int numCats = input.nextInt();
            input.nextLine();
            Cat[] cats = new Cat[50];

            for (int lcv = 0; lcv < numCats; lcv++) {
                String name = input.nextLine();
                double weight = input.nextDouble();
                int age = input.nextInt();
                double cost = input.nextDouble();
                input.nextLine();
                cats[lcv]= new Cat(name, weight, age, cost);
            }
        }
        catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}

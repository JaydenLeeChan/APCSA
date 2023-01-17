package newstuff;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Prog215h {

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog215h.txt"));
            //Put code here

            for (int con = 1; con <= 6; con++) {
                Cl215h c = new Cl215h();
                System.out.print("Contestant " + con + "\n");

                for (int i = 0; i < 8; i++) {
                    double score = input.nextDouble();
                    c.addScore(score);
                    System.out.print(score + "  ");
                }
                System.out.println("= " + c.calculateAverage());
                System.out.println();
            }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}

/*
Contestant 1
8.4  9.1  8.5  8.4  9.1  8.7  8.8  9.1  = 8.766666666666666

Contestant 2
7.0  7.0  7.0  7.0  7.0  7.0  7.0  7.0  = 7.0

Contestant 3
8.0  7.9  8.0  8.0  8.0  8.0  8.0  8.1  = 8.0

Contestant 4
6.1  7.1  8.1  8.1  8.2  8.2  7.2  6.2  = 7.483333333333334

Contestant 5
7.2  7.7  7.8  8.8  7.5  6.3  9.2  7.3  = 7.716666666666666

Contestant 6
6.8  6.9  7.3  8.8  6.7  7.7  7.9  6.3  = 7.216666666666666


Process finished with exit code 0

 */
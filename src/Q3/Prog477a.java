package Q3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Prog477a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog477a.dat"));
            //Put code here
            Cl477a gradeBook = new Cl477a();

            while (input.hasNext()) {
                int gender = input.nextInt();
                int grade = input.nextInt();
                if (gender == 1) {
                    gradeBook.addBoyGrades(grade);
                }
                if (gender == 2) {
                    gradeBook.addGirlGrades(grade);
                }
            }

            System.out.println("Grade\tMale\tFemale\tTotal");
            System.out.println("A\t" + gradeBook.getGrades("m","a") + "\t" +
                    gradeBook.getGrades("f","a") + "\t" +
                    (gradeBook.getGrades("m","a") + gradeBook.getGrades("f","a")));
            System.out.println("B\t" + gradeBook.getGrades("m","b") + "\t" +
                    gradeBook.getGrades("f","b") + "\t" +
                    (gradeBook.getGrades("m","b") + gradeBook.getGrades("f","b")));
            System.out.println("C\t" + gradeBook.getGrades("m","c") + "\t" +
                    gradeBook.getGrades("f","c") + "\t" +
                    (gradeBook.getGrades("m","c") + gradeBook.getGrades("f","c")));
            System.out.println("D\t" + gradeBook.getGrades("m","d") + "\t" +
                    gradeBook.getGrades("f","d") + "\t" +
                    (gradeBook.getGrades("m","d") + gradeBook.getGrades("f","d")));
            System.out.println("F\t" + gradeBook.getGrades("m","f") + "\t" +
                    gradeBook.getGrades("f","f") + "\t" +
                    (gradeBook.getGrades("m","f") + gradeBook.getGrades("f","f")));
        }
        catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}


/*
Grade	Male	Female	Total
A	2	4	6
B	4	4	8
C	4	7	11
D	2	3	5
F	3	0	3

Process finished with exit code 0

 */
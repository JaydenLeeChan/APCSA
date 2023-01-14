package newstuff;

import java.util.*;
import java.io.*;

public class LP39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your birthdate: ");

        System.out.println("Year: ");
        int birthYear = input.nextInt();

        System.out.println("Month: ");
        int birthMonth = input.nextInt();

        System.out.println("Day: ");
        int birthDay = input.nextInt();


        System.out.println("Enter today's date: ");

        System.out.println("Year: ");
        int currentYear = input.nextInt();

        System.out.println("Month: ");
        int currentMonth = input.nextInt();

        System.out.println("Day: ");
        int currentDay = input.nextInt();

        ClLP39 dateCalc = new ClLP39();

        dateCalc.calcYear(birthYear, currentYear);
        dateCalc.calcMonth(birthMonth, currentMonth);
        dateCalc.calcDay(birthDay, currentDay);

        int totalDays = dateCalc.getRunningTotal();

        System.out.println("You have been alive for " + totalDays + " days.");
        System.out.println("You have slept " + totalDays*8 + " hours.");


    }
}
/*
Enter your birthdate:
Year:
1997
Month:
2
Day:
12
Enter today's date:
Year:
2012
Month:
08
Day:
03
You have been alive for 5646 days.
You have slept 45168 hours.
 */
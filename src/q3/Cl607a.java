package q3;

import java.io.*;
import java.util.*;

public class Cl607a {
    private String myCode = "";
    private String myDate = "";
    private String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String cutAlphabet = "OQRSTUVWXYZ";
    private String reverseAlphabet = "ZYXWVUTSRQPONMLKJIHGFEDCBA";

    public Cl607a() {
    }

    public String getEncode(String date) {
        myDate = date;

        int firstSlashIndex = myDate.indexOf('/');
        int secondSlashIndex = myDate.indexOf('/', firstSlashIndex + 1);

        int month = Integer.parseInt(myDate.substring(0, firstSlashIndex));
        int day = Integer.parseInt(myDate.substring(firstSlashIndex+1, secondSlashIndex));
        int year = Integer.parseInt(myDate.substring(secondSlashIndex+1));
        if (year >=0 && year < 100) {
            year += 1900;
        }

        int yearDif = year-1970;

        String StringDay = "";

        if (day < 10) {
            StringDay = "0" + day;
        }

        String monthCode = alphabet.substring(month-1, month);

        String dayCode = alphabet.substring(16 + (day / 10) - 1, 16 + (day / 10)) + alphabet.substring(16 + (day % 10) - 1, 16 + (day % 10));

        if (day < 10) {
            dayCode = "O" + alphabet.substring(16 + (day % 10) - 1, 16 + (day % 10));
        }
        String yearCode = reverseAlphabet.substring(yearDif-1, yearDif);

        return monthCode+dayCode+yearCode;

    }
    public String getDecode(String code) {
        myCode = code;

        int myMonth = alphabet.indexOf(code.substring(0, 1))+1;
        int myDayFirstDigit = cutAlphabet.indexOf(code.substring(1, 2));
        int myDaySecondDigit = cutAlphabet.indexOf(code.substring(2, 3));
        int year = reverseAlphabet.indexOf(code.substring(3,4));

        return myMonth + "/" + myDayFirstDigit + myDaySecondDigit + "/" + (year+1971);
    }
}

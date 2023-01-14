package newstuff;

public class ClLP39 {

    private int mybirthYear = 0;
    private int mybirthMonth = 0;
    private int mybirthDay = 0;

    private int mycurrentYear = 0;
    private int mycurrentMonth = 0;
    private int mycurrentDay = 0;


    private int runningTotal = 0;

    public ClLP39() {

    }

    public void calcYear (int birthYear, int currentYear) {
        mybirthYear = birthYear;
        mycurrentYear = currentYear;

        int difference = mycurrentYear-mybirthYear;

        int days = difference*365;

        runningTotal += days;


    }

    public void calcMonth (int birthMonth, int currentMonth) {
        mybirthMonth = birthMonth;
        mycurrentMonth = currentMonth;

        int difference = mycurrentMonth-mybirthMonth;

        int days = difference*30;

        runningTotal += days;


    }

    public void calcDay (int birthDay, int currentDay) {
        mybirthDay = birthDay;
        mycurrentDay = currentDay;

        int difference = mycurrentDay-mybirthDay;

        int days = difference;

        runningTotal += days;


    }

    public int getRunningTotal() { return runningTotal; }
}

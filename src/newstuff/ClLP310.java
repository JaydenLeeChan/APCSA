package newstuff;

public class ClLP310 {
    private double myrunningTotal = 0;

    private int myburgersNum = 0;
    private int myfriesNum = 0;
    private int mysodasNum = 0;

    private double mytax = 0;

    public ClLP310() {

    }

    public void setBurgersNum(int burgersNum) {
        myburgersNum = burgersNum;
        myrunningTotal += myburgersNum*1.69;
    }

    public void setFriesNum(int friesNum) {
        myfriesNum = friesNum;
        myrunningTotal += myfriesNum*1.09;
    }

    public void setSodasNum(int sodasNum) {
        mysodasNum = sodasNum;
        myrunningTotal += mysodasNum*0.99;
    }

    public void setMytax() {
        mytax = myrunningTotal*0.065;
        myrunningTotal +=mytax;
    }

    public double getMyrunningTotal() { return myrunningTotal; }
    public double getMyTax() { return mytax; }
}

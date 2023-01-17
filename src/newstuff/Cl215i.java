package newstuff;

public class Cl215i {
    private int myVehicleID = 0;
    private double myMiles = 0;
    private double myGallons = 0;
    private double myMPG = 0;

    public Cl215i(int vehicleID, double miles, double gallons, double MPG) {
        myVehicleID = vehicleID;
        myMiles = miles;
        myGallons = gallons;
        myMPG = MPG;
    }

    public int getMyVehicleID() { return myVehicleID; }
    public double getMyMiles() { return myMiles; }
    public double getMyGallons() { return myGallons; }
    public double getMyMPG() { return myMPG; }

    public String toString() {
        return myVehicleID + "\t\t" + myMiles + "\t\t" + myGallons + "\t\t" + myMPG;
    }

}
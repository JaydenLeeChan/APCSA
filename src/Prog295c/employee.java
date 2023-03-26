package Prog295c;

public class employee {
    private String mySSN = "";
    private int numerizedSSN = 0;
    private String myClass = "";
    private String myType = "";
    private int myDept = 0;

    public employee(String SSN, String cls, String type, int dept) {
        mySSN = SSN;
        myClass = cls;
        myType = type;
        myDept = dept;

        numerizedSSN += Integer.parseInt(mySSN.substring(0,1)) * 100000000;
        numerizedSSN += Integer.parseInt(mySSN.substring(1,2)) * 10000000;
        numerizedSSN += Integer.parseInt(mySSN.substring(2,3)) * 1000000;

        numerizedSSN += Integer.parseInt(mySSN.substring(4,5)) * 100000;
        numerizedSSN += Integer.parseInt(mySSN.substring(5,6)) * 10000;

        numerizedSSN += Integer.parseInt(mySSN.substring(7,8)) * 1000;
        numerizedSSN += Integer.parseInt(mySSN.substring(8,9)) * 100;
        numerizedSSN += Integer.parseInt(mySSN.substring(9,10)) * 10;
        numerizedSSN += Integer.parseInt(mySSN.substring(10,11));
    }

    public int getNumerizedSSN() {
        return numerizedSSN;
    }

    public String toString() {
        return mySSN + " " + myClass + " " + myType + " " + myDept;
    }
}

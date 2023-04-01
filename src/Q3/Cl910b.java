package Q3;

public class Cl910b {
    private int myNum = 0;
    private int myBase = 0;

    public Cl910b(int num, int base) {
        myNum = num;
        myBase = base;
    }

    public String convertToBase(int num, int base) {
        if (num < base) {
            return getDigit(num);
        }
        return convertToBase(num/base, base) + getDigit(num % base);
    }

    public static String getDigit(int digit) {
        if (digit < 10) {
            return String.valueOf(digit);
        }

        return String.valueOf((char) (digit-10+'A'));
    }
}

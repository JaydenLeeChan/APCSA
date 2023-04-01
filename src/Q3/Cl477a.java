package Q3;

public class Cl477a {
    private int[] boyGrades = new int[5];
    private int[] girlGrades = new int[5];

    public Cl477a () {

    }

    public void addBoyGrades(int grade) {
        if (grade == 1) {
            boyGrades[0] = ++boyGrades[0];
        }
        if (grade == 2) {
            boyGrades[1] = ++boyGrades[1];
        }
        if (grade == 3) {
            boyGrades[2] = ++boyGrades[2];
        }
        if (grade == 4) {
            boyGrades[3] = ++boyGrades[3];
        }
        if (grade == 5) {
            boyGrades[4] = ++boyGrades[4];
        }
    }

    public void addGirlGrades(int grade) {
        if (grade == 1) {
            girlGrades[0] = ++girlGrades[0];
        }
        if (grade == 2) {
            girlGrades[1] = ++girlGrades[1];
        }
        if (grade == 3) {
            girlGrades[2] = ++girlGrades[2];
        }
        if (grade == 4) {
            girlGrades[3] = ++girlGrades[3];
        }
        if (grade == 5) {
            girlGrades[4] = ++girlGrades[4];
        }
    }

    public int getGrades(String gender, String grade) {
        if (gender.equals("m")) {
            if (grade.equals("a")) {
                return boyGrades[0];
            }
            if (grade.equals("b")) {
                return boyGrades[1];
            }
            if (grade.equals("c")) {
                return boyGrades[2];
            }
            if (grade.equals("d")) {
                return boyGrades[3];
            }
            if (grade.equals("f")) {
                return boyGrades[4];
            }
        }

        if (gender.equals("f")) {
            if (grade.equals("a")) {
                return girlGrades[0];
            }
            if (grade.equals("b")) {
                return girlGrades[1];
            }
            if (grade.equals("c")) {
                return girlGrades[2];
            }
            if (grade.equals("d")) {
                return girlGrades[3];
            }
            if (grade.equals("f")) {
                return girlGrades[4];
            }
        }
        return 0;
    }
}

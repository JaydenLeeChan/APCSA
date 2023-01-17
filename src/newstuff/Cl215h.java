package newstuff;

import java.util.ArrayList;

class Cl215h {
    private ArrayList<Double> scores;
    private double total;

    public Cl215h() {
        scores = new ArrayList<Double>();
    }

    public void addScore(double score) {
        scores.add(score);
        total = total + score;
    }

    public double calculateAverage() {
        double min = scores.get(0);
        double max = scores.get(0);
        for (int i = 1; i < 8; i++) {
            if (scores.get(i) < min) {
                min = scores.get(i);
            }
            if (scores.get(i) > max) {
                max = scores.get(i);
            }
        }

        total = total - min - max;
        return total / 6;
    }
}

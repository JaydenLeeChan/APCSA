package newstuff;
import java.io.*;
import java.util.*;

public class ClLP314 {

    private int myaubreyVotes = 0;
    private int mymartinezVotes = 0;
    private int totalVotes = 0;

    public ClLP314(int aubreyVotes, int martinezVotes) {
        myaubreyVotes = aubreyVotes;
        mymartinezVotes = martinezVotes;
        totalVotes = myaubreyVotes+mymartinezVotes;
    }

    public double aubreyPercent() {
        double aubreyP = Math.round((double) myaubreyVotes/(double) totalVotes*10000.0)/100.0;
        return aubreyP;
    }

    public double martinezPercent() {
        double martinezP = Math.round((double) mymartinezVotes/(double) totalVotes*10000.0)/100.0;
        return martinezP;
    }
}

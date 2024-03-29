package Prog702p;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Prog702p {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog701g.dat"));
            //Put code here
            List<Animal> list = new ArrayList<Animal>();

            int num = input.nextInt();
            while (num != 99) {
                String n = input.next();
                String w = input.next();

                if (num == 1) {
                    double worth = input.nextDouble();
                    Animal p = new Hiccas(n, w, worth);
                    list.add(p);
                } else if (num == 2) {
                    int steps = input.nextInt();
                    Animal p = new Wallies(n, w, steps);
                    list.add(p);
                } else if (num == 3) {
                    String ExWord = input.next();
                    Animal p = new Beepers(n, w, ExWord);
                    list.add(p);
                }
                num = input.nextInt();
            }

            String allBeeperWords = "";
            double totHiccasWorth = 0;
            int hiccasCnt = 0;
            double totWalliesSteps = 0;
            int walliesCnt = 0;
            double totBeepersLength = 0;
            int beepersCnt = 0;
            String large = "";
            String sm = "a;ldk fj;lsadfjlk;asd jflk;asdjfl;kajsdl;kf jas;ldjfasl;k jf;lasd jfl;sdakfj asld; fdslfj as;ldf dsa;l jfkl;asdj fl;ja jlkk ;jl k;kl ;j ;jk ;klj jksadljldjs;ak ;fdsa ;jkjk fnk jsa kdj;fadsk j;kfsakjd;jk fa ;ldjsjkf;jkl asd jl;f ;kasdjl fk;aj ks;d jk;f; jksj;k n ;jdkls fjksad;; jfkks ;djdfls akjlasd;lfja;ls jfl;ksad jf;laks jf;lsksa jf;lkfjd;aslkfja;slk dfja;skdfj ;alskdfj a;lskdfj a;lsk dfja;sldkj a;lskdfj ;asl dfkjas;ldkf jla;skdfj ;laksdjf;lkasdfj l;ak jsdfl;askdfj laskdfj l;askdfj la;sdkfj ;laskdfj ;laskdj f;askd fjas;ldkf j;asdk fjas;ldkfj as;lkfj sadl;kfj asdl;kfj sadk; fjlasl;kdsj fasl;kdfj as;ldkfj a;lsd fk;al skdf;al skdfj;a lskdfa;s ldfjka;slkdf ja;slk fja;lskdfj ;alskdfja;lsdkfj a;sl kdfa;lskfj a;lskdfj a;sldkfj as;ldkfj a;lskdf a;skdjf kl;asd;alskdjf;alskdfja;lsdkfj;alsdkfjal;sdkfjkfjdflsaj;lasdjk;l s ;;jj j ;kjk ;ljk ;ljkl  ;jjk;;jk lj  jkjk ;jj ;lkljkjjkl  ;lk lj;sad lfk;sad;fklsd fasdlf;k jsadl;kfj dsa;lf jdsal;f jkasdl ;fj fjsda fjal;s jfklsd;aj fl;sakjd fkl;adsflk;asjdf lsadjf kl;sadj flksdaj fl;kasdj fl;kasdfj ;lkas dfjal;sdkfj a;lsdfjk l;asdfjk;laksdfj ;lkasdfj ;lk asfjl;k fs;aldkj ;laks dfj;alsdkfj ;asd kfja;sldkfj ;asldkfj asd;lf as;dlkfj ";
            for (Animal x : list) {
                if (x instanceof Hiccas) {
                    totHiccasWorth += ((Hiccas)x).getMyWorth();
                    hiccasCnt++;
                }
                if (x instanceof Wallies) {
                    totWalliesSteps += ((Wallies)x).getMySteps();
                    walliesCnt++;
                }
                if (x instanceof Beepers) {
                    String xstring = ((Beepers)x).getMyExWord();
                    allBeeperWords = allBeeperWords + xstring;
                    totBeepersLength += xstring.length();
                    beepersCnt++;
                }
            }

            String allBeeperWordsCaps = allBeeperWords.toUpperCase();
            String ab = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            int[] count = new int[26];

            for (int lcv = 0; lcv < allBeeperWordsCaps.length(); lcv++) {
                for (int lcv2 = 0; lcv2 < ab.length(); lcv2++) {
                    if (allBeeperWordsCaps.substring(lcv, lcv+1).equals(ab.substring(lcv2, lcv2+1)))
                        count[lcv2]++;
                }
            }

            int max = count[0];
            int maxID = 0;
            for (int lcv = 1; lcv < count.length; lcv++) {
                if (count[lcv] > max) {
                    max = count[lcv];
                    maxID = lcv;
                }
            }

            //The average number of steps taken by the Wallies is:  63.2
            //The average size of the Beepers words is:  7.25
            System.out.println("The average value of the Hicca fur is: " + String.format("%.2f", (totHiccasWorth/hiccasCnt)));
            System.out.println("The average number of steps taken by the Wallies is: " + String.format("%.2f", (totWalliesSteps/walliesCnt)));
            System.out.println("The average size of the Beepers words is: " + String.format("%.2f", (totBeepersLength/beepersCnt)));
            System.out.print("The most common letter in all the Beepers' words is: ");
            for (int k = 0; k < ab.length(); k++) {
                if (count[k] == max) {
                    System.out.print(ab.substring(k,k+1) + " ");
                }
            }
        }
        catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}

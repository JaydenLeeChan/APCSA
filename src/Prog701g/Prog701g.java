package Prog701g;

import javax.swing.plaf.synth.SynthUI;
import java.io.File;
import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;


public class Prog701g {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog701g.dat"));
            //Put code here
            List<Person> list = new ArrayList<Person>();

            int num = input.nextInt();
            while (num != 99) {
                String f = input.next();
                String l = input.next();

                if (num == 1) {
                    double g = input.nextDouble();
                    Person p = new Student(f, l, g);
                    list.add(p);
                } else if (num == 2) {
                    int n = input.nextInt();
                    Person p = new Teacher(f, l, n);
                } else if (num == 3) {
                    String fav = input.next();
                    Person p = new Admin(f, l, fav);
                    list.add(p);
                }
                num = input.nextInt();
            }

            double tot = 0;
            int cnt = 0;
            int totstus = 0;
            String large = "";
            String sm = "a;ldk fj;lsadfjlk;asd jflk;asdjfl;kajsdl;kf jas;ldjfasl;k jf;lasd jfl;sdakfj asld; fdslfj as;ldf dsa;l jfkl;asdj fl;ja jlkk ;jl k;kl ;j ;jk ;klj jksadljldjs;ak ;fdsa ;jkjk fnk jsa kdj;fadsk j;kfsakjd;jk fa ;ldjsjkf;jkl asd jl;f ;kasdjl fk;aj ks;d jk;f; jksj;k n ;jdkls fjksad;; jfkks ;djdfls akjlasd;lfja;ls jfl;ksad jf;laks jf;lsksa jf;lkfjd;aslkfja;slk dfja;skdfj ;alskdfj a;lskdfj a;lsk dfja;sldkj a;lskdfj ;asl dfkjas;ldkf jla;skdfj ;laksdjf;lkasdfj l;ak jsdfl;askdfj laskdfj l;askdfj la;sdkfj ;laskdfj ;laskdj f;askd fjas;ldkf j;asdk fjas;ldkfj as;lkfj sadl;kfj asdl;kfj sadk; fjlasl;kdsj fasl;kdfj as;ldkfj a;lsd fk;al skdf;al skdfj;a lskdfa;s ldfjka;slkdf ja;slk fja;lskdfj ;alskdfja;lsdkfj a;sl kdfa;lskfj a;lskdfj a;sldkfj as;ldkfj a;lskdf a;skdjf kl;asd;alskdjf;alskdfja;lsdkfj;alsdkfjal;sdkfjkfjdflsaj;lasdjk;l s ;;jj j ;kjk ;ljk ;ljkl  ;jjk;;jk lj  jkjk ;jj ;lkljkjjkl  ;lk lj;sad lfk;sad;fklsd fasdlf;k jsadl;kfj dsa;lf jdsal;f jkasdl ;fj fjsda fjal;s jfklsd;aj fl;sakjd fkl;adsflk;asjdf lsadjf kl;sadj flksdaj fl;kasdj fl;kasdfj ;lkas dfjal;sdkfj a;lsdfjk l;asdfjk;laksdfj ;lkasdfj ;lk asfjl;k fs;aldkj ;laks dfj;alsdkfj ;asd kfja;sldkfj ;asldkfj asd;lf as;dlkfj ";
            for (Person x : list) {
                if (x instanceof Student) {
                    tot += ((Student)x).getGPA();
                    cnt++;
                }
                if (x instanceof Teacher) {
                    totstus += ((Teacher)x).getMyNumStuds();
                }
                if (x instanceof Admin) {
                    String xstring = ((Admin)x).getFavw();
                    if (xstring.length() > large.length())
                        large = xstring;
                    if (xstring.length() < sm.length())
                        sm = xstring;
                }
            }

            System.out.println("Average student GPA: " + String.format("%.2f", (tot/cnt)));
            System.out.println("Total number of students taught by teachers: " + totstus);
            System.out.println("Smallest favorite admin word: " + sm);
            System.out.println("Largest favorite admin word: " + large);
        }
        catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}

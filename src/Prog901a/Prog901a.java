package Prog901a;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Prog901a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog512h.dat"));
            //Put code here
            Cl901a.printFile(input);
        }
        catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}


/*
Good morning life and all
Things glad and beautiful
My pockets nothing hold
But he that owns the gold
The sun is my great friend
His spending has no end
Hail to the morning sky
Which bright clouds measure high
Hail to you birds whose throats
Would number leaves by notes
Hail to you shady bowers
And you green fields of flowers
Hail to you women fair
That make a show so rare
In cloth as white as milk
Be it calico or silk
Good morning life and all
Things glad and beautiful

lla dna efil gninrom dooG
lufituaeb dna dalg sgnihT
dloh gnihton stekcop yM
dlog eht snwo taht eh tuB
dneirf taerg ym si nus ehT
dne on sah gnidneps siH
yks gninrom eht ot liaH
hgih erusaem sduolc thgirb hcihW
staorht esohw sdrib uoy ot liaH
seton yb sevael rebmun dluoW
srewob ydahs uoy ot liaH
srewolf fo sdleif neerg uoy dnA
riaf nemow uoy ot liaH
erar os wohs a ekam tahT
klim sa etihw sa htolc nI
klis ro ocilac ti eB
lla dna efil gninrom dooG
lufituaeb dna dalg sgnihT

Process finished with exit code 0
 */
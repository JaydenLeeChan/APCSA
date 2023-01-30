package Prog702p;

public class Beepers extends Animal {
    private String myExWord;
    public Beepers(String n, String w, String exword) {
        super(n, w);
        myExWord = exword;
    }

    public String getMyExWord() { return myExWord; }
}
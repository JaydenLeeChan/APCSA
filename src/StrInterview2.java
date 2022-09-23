public class StrInterview2 {
    public static void main(String[] args) {
        String word = "Mary";
        String anagram = "Army";

        word = word.toLowerCase ();
        anagram = anagram.toLowercase();
        if (word.length() != anagram.length()) {
            System.out.println("Not anymore")
        } else {
            for (int lcv = 0; lcv < word.length(); lcv++) {
                char c word.charAt(lcv);
                int index = anagram.indexof(c);

                if (index != -1) {
                    anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());
                } else {
                    System.out.println("Not anagrams")
                }
            }
        }

    }
}

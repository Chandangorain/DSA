/*
Find the Longest Valid Word
The length of the word is even.
The word starts with a vowel (a, e, i, o, u).

If there are multiple valid words with the same maximum length, return the first one.

If there is no valid word, return "00".


*/

package String;
import java.util.Scanner;
public class Longestword {
   
    public static String longestWord(String sentence) {

        String[] words = sentence.split(" ");

        String longest = "";

        for (int i = 0; i < words.length; i++) {

            String word = words[i];

            char first = Character.toLowerCase(word.charAt(0));

            // Check even length and starts with vowel
            if (word.length() % 2 == 0 &&
                (first == 'a' || first == 'e' || first == 'i' ||
                 first == 'o' || first == 'u')) {

                // Keep the first word if lengths are equal
                if (word.length() > longest.length()) {
                    longest = word;
                }
            }
        }

        if (longest.equals("")) {
            return "00";
        }

        return longest;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();

        System.out.println(longestWord(sentence));
    }
}
    


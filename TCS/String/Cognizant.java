/* count the adjacent vowel-consonant pairs
input=hello
output=3
explanation : the pairs are (h,e), (e,l), (l,o) =>3
*/

package String;

public class Cognizant {
    private static boolean isvowel(char ch) {
    return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
}

public static int countPairs(String s) {
    int count = 0;

    for (int i = 0; i < s.length() - 1; i++) {
        // Place variables INSIDE the loop so they update with 'i'
        char present = s.charAt(i);
        char next = s.charAt(i + 1);

        // Pass 'present' and 'next' into the isvowel() function
        if ((isvowel(present) && !isvowel(next)) || (!isvowel(present) && isvowel(next))) {
            count++;
        }
    }

    return count;
}
    public static void main(String[] args) {
        String s = "abac";
        int result = countPairs(s);
        System.out.println(result);
    }
    
}

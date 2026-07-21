/*
remove duplicate characters from a string

*/


package String;
    import java.util.*;
public class RemoveDuplicate {

    public static String removeDuplicate(String s) {

        HashSet<Character> set = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (!set.contains(ch)) {            // not duplicate
                set.add(ch);
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(removeDuplicate(s));
    }
}
    

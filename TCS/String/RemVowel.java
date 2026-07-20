package String;
    import java.util.*;
public class RemVowel {

    public static void removeVowels(String s) {

        for (int i = 0; i < s.length(); i++) {

            char ch = Character.toLowerCase(s.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                continue;
            }

            System.out.print(s.charAt(i));
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        removeVowels(s);
    }
}


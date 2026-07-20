package String;
import java.util.Scanner;
public class RemSpace {
 
    public static void removeSpaces(String s) {

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == ' ') {
                continue;
            }

            System.out.print(s.charAt(i));
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        removeSpaces(s);
    }
}
    


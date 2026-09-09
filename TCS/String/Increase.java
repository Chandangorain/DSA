/*
Given a string s containing digits, calculate the total cost of removing all the non-zero digits.

The cost of removing each digit is digit + 1.
0 should not be considered and contributes 0.
Return the total cost.

input=9804
output=24
explanation: (9+1)+(8+1)+0+(4+1)=24
*/

package String;
import java.util.Scanner;
public class Increase {
    public static int output(String s) {
        int n = s.length();
        int result = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch != '0') {
                int digit=ch-'0';
                result = digit + 1;
                sum += result;
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String s = sc.next();

        int ans = output(s);

        System.out.println("Total cost: " + ans);

        sc.close();
    }
}


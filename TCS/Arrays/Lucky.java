/*  a number is lucky if 
at least one digit is repeated
sum of digits is even
should not contain 0
*/


package Arrays;

import java.util.*;

public class Lucky {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Number of test cases
        int T = sc.nextInt();

        // Run T times
        for (int t = 0; t < T; t++) {

            // Read the number as int
            int n = sc.nextInt();

            int sum = 0;
            boolean hasZero = false;
            boolean repeated = false;

            // HashMap to store frequency of digits
            HashMap<Integer, Integer> map = new HashMap<>();

            // Extract digits one by one
            while (n > 0) {

                // Get the last digit
                int digit = n % 10;

                // Remove the last digit
                n = n / 10;

                // Check if digit is 0
                if (digit == 0) {
                    hasZero = true;
                }

                // Add digit to sum
                sum = sum + digit;

                // Store frequency of digit
                map.put(digit, map.getOrDefault(digit, 0) + 1);

                if (map.get(digit) > 1) {
                    repeated = true;
                }
            }
            if (!hasZero && sum % 2 == 0 && repeated) {
                System.out.println("Lucky");
            } else {
                System.out.println("Not Lucky");
            }
        }

        sc.close();
    }
}

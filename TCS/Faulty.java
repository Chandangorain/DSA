
 import java.util.*;
public class Faulty {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {

            int n = sc.nextInt();

            // Check divisibility by 3
            boolean divisible;
           if (n % 3 == 0) {
            divisible = true;
             } else {
             divisible = false;
}

            // Store original number
            int temp = n;

            // Check whether number contains 7
            boolean hasSeven = false;

            while (temp > 0) {

                // Extract last digit
                int digit = temp % 10;

                // Check for 7
                if (digit == 7) {
                    hasSeven = true;
                }

                // Remove last digit
                temp = temp / 10;
            }

            // Both conditions are true
            if (divisible && hasSeven) {
                System.out.println("CRITICAL");
            }

            // Only one condition is true
            else if (divisible || hasSeven) {
                System.out.println("FAULTY");
            }

            // Neither condition is true
            else {
                System.out.println("NORMAL");
            }
        }

        sc.close();
    }
}
    


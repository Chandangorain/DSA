package Arrays;
import java.util.*;
public class Lemonade {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] bills = new int[n];
        for (int i = 0; i < n; i++) {
            bills[i] = sc.nextInt();
        }
        int five = 0;
        int ten = 0;
        for (int i=0;i<bills.length;i++) {
            int bill = bills[i];
            if (bill == 5) {

                // No change needed, simply keep the $5
                five++;
            }

            // Customer pays with $10
            else if (bill == 10) {

                // We must give one $5 as change
                if (five == 0) {

                    // No $5 available, impossible
                    System.out.println(false);
                    return;
                }

                // Give one $5
                five--;

                // Receive one $10
                ten++;

            }

            // Customer pays with $20
            else {

                // Best option: give one $10 and one $5
                if (ten > 0 && five > 0) {

                    // Use one $10
                    ten--;

                    // Use one $5
                    five--;
                }

                // Otherwise give three $5 bills
                else if (five >= 3) {

                    // Give three $5 bills
                    five = five - 3;
                }

                // No valid change available
                else {

                    System.out.println(false);
                    return;
                }
            }
        }
        System.out.println(true);
    }
}
    


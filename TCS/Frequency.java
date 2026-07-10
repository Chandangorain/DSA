/*
check every frequency of the number in the array and return the first unique number which frequency is 1
input: [9, 2, 3, 2, 6, 6, 9, 7, 3]
output: 7
*/


package TCS;
import java.util.*;
public class Frequency {
    public static int firstUnique(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency of every element
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Find the first element whose frequency is 1
        for (int num : nums) {
            if (map.get(num) == 1) {
                return num;
            }
        }

        return -1; // No unique element found
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(firstUnique(nums));
    }

    
}

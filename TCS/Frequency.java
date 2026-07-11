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
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int i : nums) {
            if (map.get(i) == 1) {
                return i;
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

/*
no of distinct avg
lc 2465
Input: nums = [4,1,4,0,3,5]
Output: 2
Explanation:
1. Remove 0 and 5, and the average is (0 + 5) / 2 = 2.5. Now, nums = [4,1,4,3].
2. Remove 1 and 4. The average is (1 + 4) / 2 = 2.5, and nums = [4,3].
3. Remove 3 and 4, and the average is (3 + 4) / 2 = 3.5.
Since there are 2 distinct numbers among 2.5, 2.5, and 3.5, we return 2.
*/

package Twopointer;
import java.util.Arrays;
import java.util.HashSet;
public class Distinct {
    public static int distinct(int[]nums){
        int n=nums.length;
        Arrays.sort(nums);
        HashSet<Double> set = new HashSet<>();
        int left=0;
        int right=n-1;
        while(left<right){
            double avg=(nums[left]+nums[right])/2.0;
            set.add(avg);
            left++;
            right--;
        }
        return set.size();

    }
    public static void main(String[] args) {
        int[] nums = {4, 1, 4, 0, 3, 5};
        System.out.println("Number of distinct averages: " + distinct(nums)); // Output: 2
    }
    
}

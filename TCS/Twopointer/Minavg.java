/* lc 3194
Minimum Average of Smallest and Largest Elements
Input: nums = [1,9,8,3,10,5]

Output: 5.5
*/
package Twopointer;

import java.util.Arrays;

public class Minavg {
    public static double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
       double min=Integer.MAX_VALUE;
       while(i<j){
        double avg=(nums[i]+nums[j])/2.0;
        min=Math.min(min,avg);
        i++;
        j--;
       }
        return min;
    }
    public static void main(String[] args) {
        int[] nums = {1, 9, 8, 3, 10, 5};
        double result = minimumAverage(nums);
        System.out.println("Minimum average of smallest and largest elements: " + result);
    }

    
}

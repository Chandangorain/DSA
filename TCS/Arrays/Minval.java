/*
lc 1413 : minimum value to get positive step by step sum
Input: nums = [-3,2,-3,4,2]
Output: 5
Explanation: If you choose startValue = 4, in the third iteration your step by step sum is less than 1.
create minsum and store it. it will add all the -ve numbers , then return 1-minsum, so that ans will be 1-(-ve)=+ve

 */

package Arrays;
public class Minval {
    public static int minStartValue(int[] nums) {
        int sum=0;
        int minsum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            minsum=Math.min(sum,minsum);
        }
        return 1-minsum;
    }
    public static void main(String[] args) {
        Minval minval = new Minval();
        int[] nums = {-3, 2, -3, 4, 2};
        int result = minval.minStartValue(nums);
        System.out.println("Minimum start value: " + result);
    }
    
}

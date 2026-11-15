/*
lc 2903
Input: nums = [5,1,4,1], indexDifference = 2, valueDifference = 4
Output: [0,3]
Explanation: In this example, i = 0 and j = 3 can be selected.
abs(0 - 3) >= 2 and abs(nums[0] - nums[3]) >= 4.
Hence, a valid answer is [0,3].
[3,0] is also a valid answer.
*/

package Twopointer;
public class Difference {
    public static int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(Math.abs(i-j)>=indexDifference && 
                Math.abs(nums[i]-nums[j])>=valueDifference){
                        return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[] nums = {5, 1, 4, 1};
        int indexDifference = 2;
        int valueDifference = 4;
        int[] result = findIndices(nums, indexDifference, valueDifference);
        System.out.print("Indices found: ");
        System.out.print("[" + result[0] + ", " + result[1] + "]");
    }
    
}

/*
 lcc 611 :Valid Triangle Number
Given an integer array nums, return the number of triplets chosen from the array that can make triangles if we take them as side lengths of a triangle.
Input: nums = [2,2,3,4]
Output: 3
Explanation: Valid combinations are: 
2,3,4 (using the first 2)
2,3,4 (using the second 2)
2,2,3
*/

package Twopointer;
public  class Validtriangle {
    public  static int triangleNumber(int[] nums) {
        int n=nums.length;
        int count=0;
       for(int i = 0; i < n; i++) {
    for(int j = i + 1; j < n; j++) {
        for(int k = j + 1; k < n; k++) {

            if(nums[i] + nums[j] > nums[k]) {
                count++;
            }
        }
    }
    }
    return count;
        
    }
  public static void main(String[] args) {
        int[] nums = {2, 2, 3, 4};
        int result = triangleNumber(nums);
        System.out.println("Number of valid triangles: " + result);
    }
    
}

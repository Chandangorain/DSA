/*
lc 2367
Input: nums = [0,1,4,6,7,10], diff = 3
Output: 2
Explanation:
(1, 2, 4) is an arithmetic triplet because both 7 - 4 == 3 and 4 - 1 == 3.
(2, 4, 5) is an arithmetic triplet because both 10 - 7 == 3 and 7 - 4 == 3. 

hint:

*/

package Twopointer;
public class Triplet {
    public static int triplet(int[]nums,int diff){
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[j]-nums[i]==diff && nums[k]-nums[j]==diff){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {0, 1, 4, 6, 7, 10};
        int diff = 3;
        System.out.println("Number of arithmetic triplets: " + triplet(nums, diff)); // Output: 2
    }

    
}

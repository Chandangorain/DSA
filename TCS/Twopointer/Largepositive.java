/*lc 2441
Input: nums = [-1,10,6,7,-7,1]
Output: 7
Explanation: Both 1 and 7 have their corresponding negative values in the array. 7 has a larger value.
run nested loop -> check sum ==0 -> store ->sort->return max
*/

package Twopointer;

import java.util.ArrayList;
import java.util.Collections;

public class Largepositive {
     public static int findMaxK(int[] nums) {
        int n=nums.length;
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==0){
                    list.add(Math.abs(nums[i]));
                    
                }
            }
        }
         if(list.size() == 0) return -1;

        Collections.sort(list);

        int max= list.get(list.size() - 1);
        
        return max;
        
    }
    public static void main(String[] args) {
        int[] nums = {-1, 10, 6, 7, -7, 1};
        System.out.println("Largest positive integer with its negative counterpart: " + findMaxK(nums)); // Output: 7
    }
    
}

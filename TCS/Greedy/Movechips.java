/*leetcode 1217. 
Minimum Cost to Move Chips to The Same Position
We have n chips, where the position of the ith chip is position[i].

We need to move all the chips to the same position. In one step, we can change the position of the ith chip from position[i] to:

position[i] + 2 or position[i] - 2 with cost = 0.
position[i] + 1 or position[i] - 1 with cost = 1.
Return the minimum cost needed to move all the chips to the same position. 
Input: position = [1,2,3]
Output: 1
Explanation: First step: Move the chip at position 3 to position 1 with cost = 0.
Second step: Move the chip at position 2 to position 1 with cost = 1.
Total cost is 1.
*/


package Greedy;

public class Movechips {
    public int minCostToMoveChips(int[] position) {
        int oddcount=0;
        int evencount=0;
        for(int i=0;i<position.length;i++){ /* If you have 10 chips at 0 and 3 chips at 1, move the 3 chips to 0 (Cost = 3).If you have 2 chips at 0 and 8 chips at 1, move the 2 chips to 1 (Cost = 2).*/
            if(position[i]%2==0){
                evencount++;
            }else{
                oddcount++;
            }
        }
        int result=Math.min(oddcount,evencount);
        return result;
    }
    
}

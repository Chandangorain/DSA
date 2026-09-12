//leetcode 455
/*
assign cookies:
Input: g = [1,2,3], s = [1,1]
Output: 1
Explanation: You have 3 children and 2 cookies. The greed factors of 3 children are 1, 2, 3. 
And even though you have 2 cookies, since their size is both 1, you could only make the child whose greed factor is 1 content.
You need to output 1.
*/
package Greedy;

import java.util.*;
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;   //for child count
        int j=0;  //for cookie count
        int count=0;
        while(i<g.length &&j<s.length){
            if(s[j]>=g[i]){ // if s'capacity>=greed then count
                count++;
                i++;
                j++;
            }else{
                j++;    //else cookie increase

            }
        }
        return count;
        
    }
}
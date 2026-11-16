/*
lc 3884
 First Matching Character From Both Ends
Input: s = "abcacbd"
Output: 1
Explanation:
At index i = 1, s[1] and s[5] are both 'b'.
No smaller index satisfies the condition, so the answer is 1.
*/
package Twopointer;
public class Matching {
    public static int firstMatchingIndex(String s) {
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)==s.charAt(n-i-1)){
                return i;
            }
        }
        return -1;
        
    }
    public static void main(String[] args) {
        String s = "abcacbd";
        int result = firstMatchingIndex(s);
        System.out.println("First matching index from both ends: " + result);
    }
    
}

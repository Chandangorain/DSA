/*
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
*/

import java.util.*;
class Solution {
    public static int lengthOfLongestSubstring(String s) {  //brute force code . if character non repeat then set.add else break and calc the length
        int n=s.length();
        int maxlen=0;
        for(int i=0;i<n;i++){
            HashSet<Character>set=new HashSet<>();
            for(int j=i;j<n;j++){       // 0(n^2)
               char ch=s.charAt(j);
               if(set.contains(ch)){
                break;
               }
                set.add(ch);
               int currlen=j-i+1;
               maxlen=Math.max(maxlen,currlen);
            }
        }
        return maxlen;
        
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int result=lengthOfLongestSubstring(s);
        System.out.println(result);
    }
    
}

/*
for optimal code we will use sliding window approach
int left=0;
int right=0;
while(right<n){
    char ch=s.charAt(right);
    if(!set.contains(ch)){
        set.add(ch);
        right++;
        maxlen=Math.max(maxlen,right-left);
    }
    else{
        set.remove(s.charAt(left));
        left++;
    }
 */
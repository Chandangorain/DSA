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
            for(int j=i;j<n;j++){
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
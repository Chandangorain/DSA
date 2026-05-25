/*
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
*/


import java.util.*;
public class Nonrepeat{
    public static int nonrepeat(String s){
        int maxlen=0;
        for(int i=0;i<s.length();i++){
            HashSet<Character>set=new HashSet<>();
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                if(set.contains(ch)){
                    break;
                }
                set.add(ch);
                int currlen=j-i+1;
                maxlen=Math.max(currlen,maxlen);
            }
        }
        return maxlen;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s = s.replace("\"", "");

        System.out.println(nonrepeat(s));

    }
} 
    


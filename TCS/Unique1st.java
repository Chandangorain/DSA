/*
leetcode 387
input: s="leetcode"
output: 0
*/
import java.util.*;
public class Unique1st {

    public static int firstunique(String s){
        int[]freq=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[ch-'a']++;

            
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(freq[ch-'a']==1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.replace("\"","");   // this line is for removing the " " from the input string
        int ans=firstunique(s);
        System.out.println(ans);
    }
    
}

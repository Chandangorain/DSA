/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Longest
{   
    public static String  characterReplacement(String s, int k) {
        int maxfreq=0;
        int n=s.length();
       int left=0;
       int[]hash=new int[26];
       int maxlen=0;
       for(int right=0;right<n;right++){
           char ch=s.charAt(right);
           hash[ch-'A']++;
           maxfreq=Math.max(maxfreq,hash[ch-'A']);      //update maxfreq
           int windowlen=right-left+1;
           if((windowlen-maxfreq)<k){
               maxlen=Math.max(maxlen,windowlen);
           }
           else{
               hash[s.charAt(left)-'A']--;
               left++;
               
           }
       }
       
    }
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        s=s.split(" ")[1];
        System.out.println(characterReplacement(s,k));
    }
}
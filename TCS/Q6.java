/*
Given a string s, perform the following two tasks:

1. Find the first non-repeating character in the string.
If no such character exists, print "None".
2. Find the most frequent character in the string.
If all characters appear only once, print the first character of the string.
s = "aabccdbe"
Output:
First non-repeating character: d
Most frequent character: a
*/



package TCS;
import java.util.*;
public class Q6 {

    public static String solution(String s){
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        char nonrepeat='0';
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.get(ch)==1){
                nonrepeat=ch;
                break;
            }
        }
        if(nonrepeat=='0'){
            System.out.println("None");
        }else{
            System.out.println(nonrepeat);
        }
        // most frequent character
        char mostfreq=s.charAt(0);
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.get(ch)>map.get(mostfreq)){
                mostfreq=ch;
            }
        }
        System.out.println("Most Frequent Character: " + mostfreq);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String result=solution(s);
        System.out.println(result);
    }
    
}

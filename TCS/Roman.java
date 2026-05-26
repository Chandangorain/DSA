/*
convert a roman numeral to an integer. 
IV=4
M=1000
*/
import java.util.*;
class Solution {
    public static int romanToInt(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            int current=value(s.charAt(i));     //here value is a function that takes a character as input and returns its corresponding integer value based on the rules of Roman numerals. The function checks the character and returns the appropriate value .
             if(i < s.length() - 1 &&
               current < value(s.charAt(i + 1))){
                sum-=current;
            }else{
                sum+=current;
            }
        }
        return sum;
        
    }
    public static int value(char c ){
           if(c == 'I') return 1;
        if(c == 'V') return 5;
        if(c == 'X') return 10;
        if(c == 'L') return 50;
        if(c == 'C') return 100;
        if(c == 'D') return 500;

        return 1000;    //if it's not any of the above characters, it must be 'M' which is 1000
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(romanToInt(s));
    }
}
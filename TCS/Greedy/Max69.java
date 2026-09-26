/*
You are given a positive integer num consisting only of digits 6 and 9.

Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).
Input: num = 9669
Output: 9969
Explanation: 
Changing the first digit results in 6669.
Changing the second digit results in 9969.
Changing the third digit results in 9699.
Changing the fourth digit results in 9666.
The maximum number is 9969.



*/

import java.util.Scanner;

class Solution {
    public static int maximum69Number (int num) {
        char[] digits = String.valueOf(num).toCharArray();
        for(int i=0;i<digits.length;i++){
            if(digits[i]=='6'){   // when get  first 6 change to 9 , only this is the max 
                digits[i]='9';
                break;
            }
        }
        return Integer.parseInt(new String(digits));

        
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]num=new int[n];
        for(int i=0;i<num.length;i++){
            num[i]=sc.nextInt();
        }
        
       
    }
}
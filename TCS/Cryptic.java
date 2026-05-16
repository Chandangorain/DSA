/*
Cryptic Numbers: A cryptic number is a number that satisfies the following conditions:
1. It is divisible by 7.
2. It is not divisible by 5.
3. It is not a palindrome (it does not read the same backward as forward).
4. It does not have any repeated digits.
within a range find it  (10,50)

*/


import java.util.*;
public class Cryptic {
    
    public static boolean isPalindrome(int n){          // palindrome check
        int original =n;
        int rev=0;
        while(n>0){
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        if(original==rev){
            return true;
        }
        return false;
    }
    public static boolean hasrepeated(int n){   // check for repeated digits
        int[]freq=new int[10];
        while(n>0){
            int digit=n%10;
            freq[digit]++;
            if(freq[digit]>1){
                return true ;
            }
            n=n/10;
        }
        return false;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int r=sc.nextInt();
        boolean found=false;
        for(int i=l;i<=r;i++){
            if(i%7==0 && i%5!=0 && !isPalindrome(i) && !hasrepeated(i)){
                System.out.print(i+" ");
                found=true;
            }
        }
        if(found==false){
            System.out.println(-1);
        }
    }


    
}

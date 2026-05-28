/*
leetcode 231. Power of Two
Given an integer n, return true if it is a power of two. Otherwise, return false

*/


import java.util.*;
public class Power2 {
    public static boolean isPowerOfTwo(int n) {
        if(n<0){
            return false;
        }
        while(n%2==0){      //16%2=0 8%2=0 4%2=0 2%2=0 1%2=1
            n=n/2;          // n=16/2=8 8/2=4 4/2=2 2/2=1
        }
        if(n==1){       // if n becomes 1 then it is a power of 2
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isPowerOfTwo(n));
    }
}
    

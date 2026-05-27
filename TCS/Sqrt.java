/*
leetcode 69 solution: sqrt(x)
input: x = 4
output: 2
*/


import java.util.*;
public class Sqrt {
     public static int mySqrt(int x) {
        int ans=0;
        int low=1;
        int high=x;
        int mid=low+(high-low)/2;
        if(mid*mid==x){
            return mid;
        }else  if(mid*mid<x){
            ans=mid;
            low=mid+1;
        }else{
            high=mid-1;

        }
        return ans;
        
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(mySqrt(x));
    }
    
}

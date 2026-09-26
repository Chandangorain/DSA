//leetcode 633
/*
Given a non-negative integer c, decide whether there're two integers a and b such that a2 + b2 = c.
input c=5
output:true ( 1*1+2*2=5)

we will use  two pointer approach from low to high and check if >0 high--, else low++

*/

import java.util.*;
public class SumofSquare{
    public static boolean judgeSquareSum(int c) {
     
        int low=0;
        //int high=c;  it is also correct but have to search extra space and lot of time so we search from the 0->root of c
        int high=(int )Math.sqrt(c);
        while(low<=high){
            int sum = (low * low) + (high * high);
            if(sum>c){
                high--;
            }else if(sum<c){
                low++;
            }else{
                return true;
            }
        }
        return false;   //default
        
    }
    public static void main(String[] args) {
      int n=sc.nextInt();


    }


}
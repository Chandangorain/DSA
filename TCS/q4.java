/*

A data analytics system continuously records the number of transactions processed by a server every minute. Due to fluctuating traffic, the operations team wants to monitor the minimum load observed over every consecutive block of K minutes to detect potential performance bottlenecks.
    You are given an integer array A of size N, where A[i] represents the number of transactions processed in the $i$-th minute, and a fixed integer K representing the size of the observation window.
    
    For every contiguous subarray (window) of size K, determine the minimum number of transactions recorded within that window.

    Input: nums = [10, 2, 5, 8, 1, 7], k = 3

    Output: [2, 2, 1, 1]



*/


package TCS;
import java.util.*;
public class q4 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int []nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        List<Integer>result=new ArrayList<>();
        int start=0;
        int end=k-1;

            int min=nums[start];
            for(int i=start;i<=end;i++){
                if(nums[i]<min){
                    min=nums[i];        //store min
                }
            }
            result.add(min);
            start++;            // window shift foreward
            end++;              // window shift foreward
        
        System.out.println(result);
    }
    
}

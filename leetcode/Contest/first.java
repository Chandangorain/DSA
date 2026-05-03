/*
        Count indices with opposite parity

You are given an integer array nums of length n.

The score of an index i is defined as the number of indices j such that:

i < j < n, and
nums[i] and nums[j] have different parity (one is even and the other is odd).
Return an integer array answer of length n, where answer[i] is the score of index i.

 

Example 1:

Input: nums = [1,2,3,4]

Output: [2,1,1,0]

Explanation:

nums[0]=1 , it's odd .now check after 1 how many are even numbers =2
nums[1]=2 , it's even .now check after 2 how many are odd numbers =1
nums[2]=3 , it's odd .now check after 3 how many are even numbers =1
nums[3]=4 , it's even .now check after 4 how many are odd numbers =0

Thus, the answer = [2, 1, 1, 0].

*/

package leetcode.Contest;
import java.util.*;
public class first {
    public static int[]oppositeParity(int[]nums){
        int n=nums.length;
        int[]result=new int[n];

        for(int i=0;i<n;i++){
            int count=0;
            for(int j=i+1;j<n;j++){
                if(nums[i]%2!=0){       // i is odd
                    if(nums[j]%2==0){   // j is even
                        count++;
                    }
                }else{          // i is even
                    if(nums[j]%2!=0){   // j is odd
                        count++;
                    }

                }
            }
            result[i]=count;
        }
        return result;
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int []output=oppositeParity(nums);
        for(int i = 0; i < output.length; i++){
         System.out.print(output[i] + " ");
}


    }
    
}

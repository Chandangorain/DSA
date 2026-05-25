/*
Example 1:

Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.
*/

import java.util.*;
class minSubarray {
    
    
    public static int minsubarraysum(int[]nums,int target){
        int left=0;
        int sum=0;
        int minlength=Integer.MAX_VALUE;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            while(sum>=target){
                minlength=Math.min(minlength,right-left+1);
                sum-=nums[left];
                left++;
            }
        }
        if(minlength==Integer.MAX_VALUE){
            return 0;
        }else{
            return minlength;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int target=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        s=s.replace("[","");    //removing the square brackets from the input string
        s=s.replace("]","");
        String[]parts=s.split(",");         //splitting the string into an array of strings based on the comma delimiter
        int[]arr=new int[parts.length];     //creating an integer array to store the parsed integers from the input string
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(parts[i].trim());   //parsing each string element to an integer and storing it in the integer array
        }
        System.out.println(minsubarraysum(arr,target));
    }
}
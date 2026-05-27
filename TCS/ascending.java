/*
leetcode 1800 solution: max ascending sum
input: nums = [10,20,30,5,10,50]
output: 65   , should be ascending order, 10+20+30=60, 5+10+50=65

*/

import java.util.*;
public class ascending {
      public static int maxAscendingSum(int[] nums) {
        int n=nums.length-1;
        int maxsum=nums[0];
        for(int i=0;i<n;i++){
            int sum=nums[i];
            while(i<n && nums[i+1]>nums[i]){
                    sum+=nums[i+1];
                    i++;

            }
            maxsum=Math.max(sum,maxsum);
        }
        return maxsum;

        
    }
    public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
   String s=sc.nextLine();
   s = s.replace("[", "");
    s = s.replace("]", "");
    String[] parts = s.split(",");
    int[] nums = new int[parts.length];
    for (int i = 0; i < parts.length; i++) {
        nums[i] = Integer.parseInt(parts[i].trim());
    }

    System.out.println(maxAscendingSum(nums));  
}

/*
Min & Max Frequency Element
Problem Statement

Given an array of integers (space-separated), find:

The element with the minimum frequency
The element with the maximum frequency

input : 1 2 2 3 3 3 4
output : 1 3
Explanation: The element 1 has the minimum frequency of 1, while the element 3
*/


import java.util.*;

public class MaxMin {
   
   public static int[]frequency(int[]nums){
    Map<Integer,Integer>map=new HashMap<>();
    int maxfreq=Integer.MIN_VALUE;
    int maxelement=nums[0];
    int minelement=nums[0];
    int minfreq=Integer.MAX_VALUE;
    int n=nums.length;
    for(int i=0;i<n;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
    }
    for(int i=0;i<n;i++){
        int currelement=nums[i];
        int currfreq=map.get(currelement);
        if(currfreq>maxfreq){
            maxfreq=currfreq;
            maxelement=currelement;
        }
        if(currfreq<minfreq){
            minfreq=currfreq;
            minelement=currelement;
        }
    }
    return new int[]{minelement,maxelement};
   }


     public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
   String[]parts=s.split(" ");
   int[]nums=new int[parts.length];
   for (int i = 0; i < parts.length; i++) {
            nums[i] = Integer.parseInt(parts[i]);
   }
     System.out.println(Arrays.toString(frequency(nums))); 
    }    
}

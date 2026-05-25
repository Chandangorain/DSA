/*
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

 

Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

*/
import java.util.*;
public class RotateArray
{   
    
    public static int[] roratearray(int[]nums,int k){
        int n=nums.length;
        k = k % n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        return nums;
    }
    public static void reverse(int[]nums,int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		sc.nextLine();
		String s=sc.nextLine();
		s=s.replace("[","");
		s=s.replace("]","");
		String[]parts=s.split(",");
		int[]arr=new int[parts.length];
		for(int i=0;i<arr.length;i++){
		    arr[i]=Integer.parseInt(parts[i].trim());
		}
		System.out.println(Arrays.toString(roratearray(arr,k)));
		
	}
}
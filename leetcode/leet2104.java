/*
Input: nums = [1,2,3]
Output: 4
Explanation: The 6 subarrays of nums are the following:
[1], range = largest - smallest = 1 - 1 = 0 
[2], range = 2 - 2 = 0
[3], range = 3 - 3 = 0
[1,2], range = 2 - 1 = 1
[2,3], range = 3 - 2 = 1
[1,2,3], range = 3 - 1 = 2
So the sum of all ranges is 0 + 0 + 0 + 1 + 1 + 2 = 4.
*/



import java.util.*;
public class leet2104 {
    public static int []subArrayRanges(int[]nums){
        int n=nums.length;

        int sum=0;
        for(int i=0;i<n;i++){
            int largest=nums[i];
            int smallest=nums[i];

            for(int j=i+1;j<n;j++){
                largest=Math.max(largest,nums[j]);
                smallest=Math.min(smallest,nums[j]);
                sum+=(largest-smallest);
            }
        }
        return new int[]{sum};
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int[] answer=subArrayRanges(nums);
        for(int i = 0; i < answer.length; i++){
            System.out.print(answer[i] + " ");
        }
    }
    
}

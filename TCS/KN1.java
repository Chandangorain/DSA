/*
return the maxsum
condition: adjacent elements should not be same
input: [1,2,3,4,5]
output: 9

*/


import java.util.*;
public class KN1
{
    public static int sliding(int[]nums){
        int n=nums.length;
        if(n<2){
            return 0;
        }
        
        int maxscore=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]!=nums[j]){
                    int sum=nums[i]+nums[j];
                    maxscore=Math.max(sum,maxscore);
                }
                break;
            }
        }
        if (maxscore == Integer.MIN_VALUE) {
        return 0;
        } else {
        return maxscore;
}
        
    }
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		s1=s1.replace("[","");
		s1=s1.replace("]","");
		String[]parts1=s1.split(",");
	    int[]nums=new int[parts1.length];
	    for(int i=0;i<parts1.length;i++){
	        nums[i]=Integer.parseInt(parts1[i].trim());
	        
	    }
	    System.out.println(sliding(nums));
	}
}
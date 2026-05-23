/*
Question: Maximum People in a Balloon

You are given:

An integer n representing the number of persons.
An array W[] where W[i] represents the weight of the i-th person.
An integer Y representing the maximum weight capacity of the balloon.

Your task is to find the maximum number of people that can travel in the balloon such that the total weight of selected people does not exceed Y.

Example
Input
n = 5

W = [20, 30, 40, 50, 60]

Y = 100
Output
3
Explanation
20 + 30 + 40 = 90 <= 100

Adding next person (50) makes total = 140 > 100

Hence, the maximum number of people is:

3
*/




import java.util.*;
public class Baloon {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        sc.nextLine(); // Consume the newline character after reading n
        String s=sc.nextLine();
        s=s.replace("["," ");
        s = s.replace("]", ""); // Split by comma 

        String[] parts = s.split(","); 
        int[] nums = new int[parts.length];
		for(int i=0;i<n;i++){
		    nums[i]=Integer.parseInt(parts[i].trim());
		}
		int c=sc.nextInt();
		Arrays.sort(nums);
		int sum=0;
		int count=0;
		for(int i=0;i<n;i++){
		    sum+=nums[i];
		    if(sum<=c){
		        count ++;
		    }else{
		        break;
		    }
		}
		System.out.println(count);
	}
    
    
}

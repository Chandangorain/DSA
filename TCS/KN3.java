/*

The Ascending Supremacy Count in a Data StreamA real-time monitoring system records a sequence of integer values Arr of size $N$. 
An element is considered "dominant" if it is strictly greater than every element that appeared before it.
The first element is always considered dominant.Your task is to determine how many elements in the sequence satisfy this dominance condition.

input = [1, 3, 2, 5, 4]
output = 3
Explanation: first element 1 is dominant , 2nd=3 , 3rd=5  

*/
import java.util.*;
public class KN3 {
    public static int sliding(int[]nums){
        int n=nums.length;
        int count=0;
       
        for(int i=0;i<n;i++){
             boolean leftok=true;
            for(int k=0;k<i;k++){           // check if any element of left is greater than i
                if(nums[k]>=nums[i]){
                    leftok=false;            
                    break;
                }
            }
             if(leftok){
                    count++;
            }
            
        }
    
     return count;
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
    


/*
contains duplicate
Input: nums = [1,2,3,1]
Output: true
*/
import java.util.*;
public class Duplicate
{   
    
    public static boolean duplicate(int[]nums){
        int n=nums.length;
        HashSet<Integer>set=new HashSet<>();
        
        for(int i=0;i<n;i++){
            if(set.contains(nums[i])){
                return true;
                
            }
            else{
                set.add(nums[i]);
            }
        }
        return false;
    }
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	s=s.replace("[","");
	s=s.replace("]","");
	String[]parts=s.split(",");
	int[]arr=new int[parts.length];
	for(int i=0;i<arr.length;i++){
	    arr[i]=Integer.parseInt(parts[i].trim());
	    
	}
	System.out.println(duplicate(arr));
	}
}
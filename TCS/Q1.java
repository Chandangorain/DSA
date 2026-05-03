/*
 Given an array of integers where every element appears even number of times except one element which appears odd number of times, 
 write a program to find that odd occurring element in O(log n) time. The equal elements must appear in pairs in the array but 
 there cannot be more than two consecutive occurrences of an element. 

 Sample Input : 
5 
2 2 3 1 1 

Sample Output : 
3 (repeats odd times)

*/


package TCS;
import java.util.*;
public class Q1 {
    public static int rangenumbers(int[]nums){
	    int n=nums.length;
	    int count=0;
	    HashMap<Integer, Integer>map=new HashMap<>();
	    for(int i=0;i<n;i++){
	         map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
	    }
	    for (int key : map.keySet()){
	        if(map.get(key) %2 !=0){
	            return key;
	        }
	    }
	    
	    return -1;
	   
	}
	public static void main(String []args){
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int[]nums=new int[n];
	    for(int i=0;i<n;i++){
	        nums[i]=sc.nextInt();
	    }
	    int result=rangenumbers(nums);
	    System.out.println(result);
	}
    
}


/*
now optimal : XOR opeartion [2,2,1,3,3]
2 ^ 2 = 0
1 ^ 1 = 0
3 stays

int[] nums = {2, 2, 3, 1, 1};

        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            result = result ^ nums[i];
        }

        System.out.println(result);

*/

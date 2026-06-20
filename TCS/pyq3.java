/*
Count Elements Greater Than All Prior Elements
input :[8,2,7,4,9]
output :3
Explanation: The elements greater than all prior elements are 8, 9, and 7.
*/



 import java.util.*;
public class pyq3 {
   
  public static int previous(int[]nums){
    int n=nums.length;
    int max=nums[0];
    int count=1;
    for(int i=0;i<n;i++){
      if(nums[i]>max){
        count++;
        max=nums[i];
      }
    }
    return count;
  }

  public static void main(String[]args){
    Scanner sc=new Scanner(System.in); 
    String s=sc.nextLine();
    s=s.replace("[","");
    s=s.replace("]","");
    String[]parts=s.split(",");
    int[]nums=new int[parts.length];
    for(int i=0;i<parts.length;i++){
       nums[i]=Integer.parseInt(parts[i]);
    }
   
    System.out.println(previous(nums));
  }
}
    
    


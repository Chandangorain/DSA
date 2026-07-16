/*
Sum is Exactly Multiple of Given T

Given an array of integers and an integer T, find the number of adjacent pairs whose sum is exactly a multiple of T.

Note: An element can be used only once. Once an element is used in a valid pair, it cannot be used again in another pair.

input: [3,7,13,-3,5]
T=10
output: 2
Explanation: The adjacent pairs whose sum is a multiple of 10 are (3,7) and (13,-3). The pair (7,13) is not valid because 7 has already been used in the first pair.
*/

 import java.util.*;
public class PairSum {
  public static int solution(int[]nums,int k ){
   int n=nums.length;
   int count=0;
   for(int i=1;i<n;i++){
    int sum=nums[i]+nums[i-1];
    if(sum%k==0){
      count++;
      i++;
      
      }
   }
   return count;
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
      int k=sc.nextInt();

 
    System.out.print(solution(arr,k));

    }
}
    


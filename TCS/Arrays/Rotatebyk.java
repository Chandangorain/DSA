/*
rotate by k place
input: [1,2,3,4,5,6,7],k=3
output: [5,6,7,1,2,3,4]
*/


package Arrays;
import java.util.*;
public class Rotatebyk {

  public static int []rotate (int[]nums,int k ){
   int n=nums.length;
   k=k%n;
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
      String s=sc.nextLine();
      s=s.replace("[","");
      s=s.replace("]","");
      String[]parts=s.split(",");
      int[]arr=new int[parts.length];
      for(int i=0;i<arr.length;i++){
        arr[i]=Integer.parseInt(parts[i].trim());
      }
      int k=sc.nextInt();

 
    System.out.print(Arrays.toString(rotate(arr,k)));

    }
}
    


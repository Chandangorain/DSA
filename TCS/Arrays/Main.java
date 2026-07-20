// check if a array sorted or not 

package TCS.Arrays;
import java.util.*;

public class Main {
  public static boolean isorted(int[]nums){
   
    for(int i=0;i<nums.length-1;i++){
      if(nums[i]>nums[i+1]){
        return false;
      }
      
    }
    return true;
  }
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      s=s.replace("[","");
      s=s.replace("]","");
      String[]parts=s.split(",");
      int[]nums=new int[parts.length];
      for(int i=1;i<nums.length;i++){
        nums[i]=Integer.parseInt(parts[i]);
      }
      System.out.print(isorted(nums));
      sc.close();
    }
}
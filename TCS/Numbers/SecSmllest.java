/*
find smallest and second smallest number in an array
*/

package Numbers;
import java.util.*;
public class SecSmllest {
    
    public static int[] removeDuplicate(int[]nums) {

        int n=nums.length;
        int first=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){

        
        if(nums[i]<first){
          second=first;
          first=nums[i];
        }
        else if(nums[i]<second && nums[i]!=first){
          second=nums[i];
        }
        }
        return new int[]{first,second};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        /* s=s.replace("[","");
        s=s.replace("]",""); */
        String[]parts=s.split(",");
        int[]nums=new int[parts.length];

        for(int i=0;i<nums.length;i++){
          nums[i]=Integer.parseInt(parts[i].trim());
        }
        System.out.println(Arrays.toString(removeDuplicate(nums)));

    }
}
    


package leetcode;
import java.util.*;
public class leet128 {
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int maxlength=0;
        for(int i=0;i<nums.length;i++){
            int count=1;
            int current=nums[i];
            while(set.contains(current+1)){         // for optimal  just while(!set.contains(current-1))
               
                current++;
                 count++;
            }
            maxlength=Math.max(maxlength,count);

        }
        return maxlength;
        
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int result=longestConsecutive(nums);
        System.out.println(result);
    }
    
    
}

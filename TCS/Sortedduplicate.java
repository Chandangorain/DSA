
import java.util.*;
public class Sortedduplicate {
    public static int removeduplicate(int[]nums){
        int n=nums.length;
        if(n==0){
            return 0;
        }
        int i=0;
        for(int j=0;j<n;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.replace("[","");
        s=s.replace("]","");
        String[] parts=s.split(",");
        int[] nums=new int[parts.length];
        for(int i=0;i<parts.length;i++){
            nums[i]=Integer.parseInt(parts[i]);
        }
        int ans=removeduplicate(nums);
        System.out.println(ans);
        for(int i=0;i<ans;i++){
            System.out.print(nums[i]+" ");
        }

    }
    
}

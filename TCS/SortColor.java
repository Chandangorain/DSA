import java.util.*;
public class SortColor {
    public static void sort(int[]nums){
        int low=0;
        int mid=0;int high=nums.length-1;

        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,low,mid);
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }else{
                swap(nums,mid,high);
                high--;
            }

        }
    }
    public static void swap(int[]nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        //sc.nextLine();             this line will be add when we hve to enter 2nd input 
        s=s.replace("[","");
        s=s.replace("]","");
        String[] parts=s.split(",");
        int[] nums=new int[parts.length];
        for(int i=0;i<parts.length;i++){
            nums[i]=Integer.parseInt(parts[i].trim());
        }
        System.out.println(Arrays.toString(nums));      // array.toString because we have to print the array in the form of [1,0,2] and not 1 0 2
        
        
    }
    
}

import java.util.*;
public class leet503 {
    public static int[]nextgreaterelements(int[]nums){
        int n=nums.length;
        int[] result = new int[n];

        for(int i=0;i<n;i++){
            result[i]=-1;
            for(int j=1;j<n;j++){
                int idx=(i+j)%n;
                if(nums[idx]>nums[i]){
                    result[i]=nums[idx];
                    break;
                }
            }
        }
        return result;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int[] result=nextgreaterelements(nums);
        for(int i=0;i<n;i++){
            System.out.print(result[i]+" ");
        }

    }
    
}

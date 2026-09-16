package Greedy;

public class JumpGame {
    public static  boolean jump(int[]nums){
        int maxreach=0;

        for(int i=0;i<nums.length;i++){
            if(i>maxreach){
                return false;
            }
            int newreach=i+nums[i];

            if(maxreach>newreach){
                maxreach=newreach;
            }
            if(maxreach>nums.length-1){
                return true;
            }
        }
       return  true;
    }
    
}

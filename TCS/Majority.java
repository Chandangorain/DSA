//leetcode 169

import java.util.*;
public class Majority{
    public static int majoritynumbers(int[]nums){
        int n=nums.length;
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])>n/2){
                return nums[i];
            }
        }
        return -1;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.replace("[","");
        s=s.replace("]","");
        String[]parts=s.split(",");
        int[]nums=new int[parts.length];
        for(int i=0;i<parts.length;i++){
            nums[i]=Integer.parseInt(parts[i].trim());
        }
        System.out.println(majoritynumbers(nums));

    }

}
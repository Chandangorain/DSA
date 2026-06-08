/*
sum of unique elements in an array
Given an integer array nums, return the sum of all the unique elements of nums.
input: nums = [1,2,3,2]
output: 4 1+3 ,, as 1,3 are unique as frequency 1
*/




import java.util.*;

public class UniqueSum {
     public static int sumOfUnique(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])==1){
                list.add(nums[i]);
            }
        }
        int sum=0;
        for(int k=0;k<list.size();k++){
            sum+=list.get(k);
        }
        return sum;
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
        System.out.println(sumOfUnique(nums));

    }
}

/*
Guardian Towers Problem
A kingdom has a row of towers, each with a certain strength.A tower is called a Guardian Tower if there is no tower with greater strength to its right.
Your task is to find all Guardian Towers in the order they appear.
input: towers = [3, 7, 8, 3, 6, 1]
output: [8, 6, 1]
*/

import java.util.*;
public class PYQ {
 public static int[]guardian(int[]nums){
    ArrayList<Integer>list=new ArrayList<>();
    int n=nums.length;
    int maxright=n-1;
    list.add(maxright);
    for(int i=n-2;i>=0;i--){
        if(nums[i]>nums[maxright]){
            list.add(i);
            maxright=nums[i];
        }
    }
    Collections.reverse(list);
    int[]ans=new int[list.size()];
    for(int i=0;i<list.size();i++){
        ans[i]=nums[list.get(i)];
    }
    return ans;
 }
    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	s=s.replace("[","");
	s=s.replace("]","");
	String[]parts=s.split(",");
	int[]arr=new int[parts.length];
	for(int i=0;i<parts.length;i++){
	    arr[i]=Integer.parseInt(parts[i]);
	}
	
	System.out.println(Arrays.toString(find(arr)));
	}
    
}

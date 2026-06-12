/*
The Equilibrium Sentinel .A sequence of power nodes is arranged randomly.You must find the first node such that:
Every node to its left has a strictly smaller value.
Every node to its right has a strictly greater value.
If no such node exists, return -1.
input: [1,3,5,4,6]
output: 5
Explanation: 5 is the first node such that every node to its left (1 and
*/

import java.util.Scanner;

public class KN{
    public static int findpivot(int []nums){
        int n=nums.length;
        for(int i= 0;i<n;i++){
            boolean leftok=true;
            boolean rightok=true;
            for(int j=0;j<i;j++){
                if(nums[j]>nums[i]){
                    leftok =false;
                    break;
                }
            }
            for(int k=i+1;k<n;k++){
                if(nums[i]>nums[k]){
                    rightok=false;
                    break;
                }
            }
            if(leftok && rightok){
                return nums[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        s = s.replace("[", "");
        s = s.replace("]", "");

        String[] parts = s.split(",");

        int[] arr = new int[parts.length];

        for(int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i].trim());
        }

        System.out.println(findpivot(arr));
    }
}
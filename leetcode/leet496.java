/*

Input: nums1 = [2,4], nums2 = [1,2,3,4]
Output: [3,-1]
Explanation: The next greater element for each value of nums1 is as follows:
- 2 is underlined in nums2 = [1,2,3,4]. The next greater element is 3.
- 4 is underlined in nums2 = [1,2,3,4]. There is no next greater element, so the answer is -1.

*/

import java.util.*;
public class leet496 {
    public static int[]nextgreaterelement(int[]nums1,int[]nums2){
        
        int[]result=new int[nums1.length];

        for(int i=0;i<nums1.length;i++){
            int curr=nums1[i];

            int index=-1;
            for(int j=0;j<nums2.length;j++){
                if(nums2[j]==curr){
                    index=j;
                    break;
                }
            }

            int nextgreater=-1;
            for(int j=index+1;j<nums2.length;j++){
                if(nums2[j]>curr){
                    nextgreater=nums2[j];
                    break;
                }
            }
            result[i]=nextgreater;
        }
         return result;
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int[]nums1=new int[n1];
        for(int i=0;i<n1;i++){
            nums1[i]=sc.nextInt();
        }
        int n2=sc.nextInt();
        int[]nums2=new int[n2];
        for(int i=0;i<n2;i++){
            nums2[i]=sc.nextInt();
        }
        int[] answer=nextgreaterelement(nums1,nums2);
        for(int i = 0; i < answer.length; i++){
            System.out.print(answer[i] + " ");
        }
        
    }
   


    
}

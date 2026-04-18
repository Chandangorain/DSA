// maximum points you can get from cards

//approach 
/*  we are going to note the approach in short and single step 
1. we will take the sum of first k elements and store it in leftsum and also store it in maxsum
2. then we will remove 1 element from leftsum and add 1 element from rightsum and check if the sum of leftsum and rightsum is greater than maxsum or not if it is greater than maxsum then we will update maxsum with the new sum of leftsum and rightsum
3. we will repeat step 2 until we have removed all k elements from leftsum and added all k elements to rightsum


*/

import java.util.*;

public class leet1423 {
     public static int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int leftsum=0;
        int rightsum=0;
        int maxsum=0;
        for(int i=0;i<k;i++){
            leftsum=leftsum+cardPoints[i];  // sum of k elements  1+2+3
        }
        maxsum=leftsum;
        int rindex=n-1;
        for(int i=k-1;i>=0;i--){
            leftsum=leftsum-cardPoints[i];      // remove 1 element from left 1+2
            rightsum=rightsum+cardPoints[rindex]; // add 1 element from right . final = 1+2+1
            rindex=rindex-1;
            maxsum=Math.max(maxsum,leftsum+rightsum);
        }
        return maxsum;
        
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]cardPoints=new int[n];
        for(int i=0;i<n;i++){
            cardPoints[i]=sc.nextInt();
        }   
        int k=sc.nextInt();
        int result=maxScore(cardPoints,k); 
        System.out.println(result);


    }
    
}

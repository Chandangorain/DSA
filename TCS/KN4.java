/*/
The Stock Oracle Challenge
In the futuristic city of Quantasia, traders rely on a time-recorded crystal that logs the price of a rare mineral every minute. The crystal provides an array prices[], where:

Each index represents a minute.

Each value represents the mineral's price at that minute.

A trader is allowed to:

Buy the mineral once.

Sell it once later.

Selling before buying is strictly forbidden.

However, the city council has imposed a rule:
If no profit can be made, the trader must report 0.
input: [7,1,5,3,6,4]
output: 5
Explanation: Buy at 1 and sell at 6 for a profit of 5.
*/


import java.util.*;
public class KN4
{
    public static int trades(int[]nums){
        int maxprofit=0;
        int n=nums.length;
       for(int i=0;i<n;i++){
           for(int j=i+1;j<n;j++){
               if(i>j){
                   return 0;
               }else{
                   int profit=nums[j]-nums[i];
                   maxprofit=Math.max(profit,maxprofit);
               }
           }
       } 
       return maxprofit;
    }
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		s1=s1.replace("[","");
		s1=s1.replace("]","");
		String[]parts1=s1.split(",");
	    int[]nums=new int[parts1.length];
	    for(int i=0;i<parts1.length;i++){
	        nums[i]=Integer.parseInt(parts1[i].trim());
	        
	    }
	    System.out.println(trades(nums));
	
	}
}

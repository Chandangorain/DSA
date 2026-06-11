

import java.util.*;
public class StockBuy {
    public static int maxprofit(int[]prices){
        int minprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            int price=prices[i];
            if(price<minprice){
                minprice=price;
            }
            int profit=price-minprice;
            if(profit>maxprofit){
                maxprofit=profit;
            }

        }
        return maxprofit;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.replace("\"","");   // this is for removing the double quotes from the input string
        String[] parts=s.split(",");
        int[] prices=new int[parts.length];
        for(int i=0;i<parts.length;i++){
            prices[i]=Integer.parseInt(parts[i]);
        }
        System.out.println(maxprofit(prices));
    }
    
}

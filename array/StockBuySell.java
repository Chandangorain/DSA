import java.util.*;

public class StockBuySell {
    public static int Stocks(int[]price){
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<price.length;i++){
            if(buyprice<price[i]){
                int profit=price[i]-buyprice;  // today's profit
                maxprofit=Math.max(maxprofit,profit);  // max profit overall
            }else{
                buyprice=price[i];
            }
        }
        return maxprofit;
    }
    public static void main(String[]args){
        int price[]={2,3,4,5,6,7};
        System.out.println(Stocks(price));
    }
    
}

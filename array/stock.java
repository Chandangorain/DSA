public class stock {
       public static int Stock(int price[]){
        int maxprofit=0,bestbuy=Integer.MAX_VALUE;
        for(int i=0;i<price.length;i++){
            if(price[i]>bestbuy){     // profit
                maxprofit=Math.max(maxprofit,price[i]-bestbuy);   //maxprofit
            }else{
                bestbuy=price[i];   //update best buy
        
            }
            
        }
        return maxprofit;

    }
    public static void main(String args[]){
        int price[]={10,20,5,60,40,9,13};
        System.out.println(Stock(price));
    
    }
}

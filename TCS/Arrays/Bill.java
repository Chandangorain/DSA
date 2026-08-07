/*
A shop gives discounts according to the total bill:

BillDiscount	
< 1000	0%
1000–4999	10%
5000–9999	20%
>= 10000	30%

But there is a special rule:

If the customer has purchased more than 5 items, they receive an additional 5% discount.

Given the item prices, calculate the final bill.
 */

package Arrays;
 import java.util.*;
public class Bill {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int[]bill=new int[n];
      for(int i=0;i<bill.length;i++){
        bill[i]=sc.nextInt();
      }
      int sum=0;
      for(int i=0;i<bill.length;i++){
        sum+=bill[i];
        
      }
      int discountedprice=sum;
      if(sum<1000){
        discountedprice=sum;
      }
      else if(sum>=1000 && sum<=4999){
       discountedprice=sum-(sum*10/100);
      }
      else if(sum>=5000 && sum<=9999){
        discountedprice=sum-(sum*20/100);
      }else{
          discountedprice=sum-(sum*30/100);
      }
      if(n>5){
        discountedprice=discountedprice-discountedprice*5/100;
        
      }
      System.out.println(discountedprice);
      

    }
}
    


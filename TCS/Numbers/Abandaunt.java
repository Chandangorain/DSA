/*
input: 12
find the sum of all factors of 12 except 12 itself
n
*/


package Numbers;
 import java.util.*;

public class Abandaunt {
   

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
      
    int sum=0;
    for(int i=1;i<n;i++){
      if(n%i==0){   //check if i is a factor of n
       sum+=i;
      }
      
    }
    if(sum>n){
      System.out.println("abandaunt");
    }else{
      System.out.println(" not abandaunt");
    }
    sc.close();
    }
    
}
    


/*
happy number is if if it is equal to the sum of its proper divisors
input: 6
output: true
explanation: proper divisors of 6 are 1,2,3 and 1+2+3=6

*/

package Numbers;
import java.util.*;
public class Happy {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
       int factor=1;
    ArrayList<Integer> list = new ArrayList<>();
    for(int i=1;i<n;i++){
      if(n%i==0){               //i is a factor add them in list them sum
       list.add(i);
      }
    }
    int sum=0;
    for(int i=0;i<list.size();i++){
      sum=sum+list.get(i);              //sum of list elements
    }
   if(sum==n){
    System.out.print("true");
   }else{
    System.out.print("false");
   }
      
   
    }
    

}

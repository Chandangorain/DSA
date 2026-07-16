/*
a=first no
n=nth number;
d=difference
formula=n/2(2a+(n-1)d)
*/


package Numbers;
import java.util.*;
public class APsum {

  public static int sumAP(int n,int d,int a){
   int sum=n*(2*a+(n-1)*d)/2;
   return sum;
    
  }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int d=sc.nextInt();
      int a=sc.nextInt();
      System.out.print(sumAP(n,d,a));
    }
}
    


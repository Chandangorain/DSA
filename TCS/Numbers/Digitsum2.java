/*
digitsum
input =38
op=2[3+8=11=1+1=2]

ip=45
op=9[4+5]
*/

package Numbers;
 import java.util.*;
public class Digitsum2 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      
     while(n >= 10) {

            int sum = 0;

            while(n > 0) {
                int digit = n % 10;
                sum += digit;
                n = n / 10;
            }

            n = sum;
        }
      System.out.print(n);
      
    }
}
    


// palindrome , originl ==rev

package Numbers;
  import java.util.*;
public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       int n=sc.nextInt();
       int originl=n;
       int rev=0;
      while(n>0){
        int digit=n%10;
        rev=rev*10+digit;
        n=n/10;
      }
      if(rev==originl){
        System.out.println("true");
      }else{
        System.out.print("false");
      }

    }
}
    


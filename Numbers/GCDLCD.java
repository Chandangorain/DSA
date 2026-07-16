package Numbers;
import java.util.*;
public class GCDLCD {
  public static int lcd(int b,int a){
    a=Math.abs(a);
    b=Math.abs(b);
    int gcd=1;
    
    int min=Math.min(b,a);
    for(int i=1;i<=min;i++){
      if(a%i==0 && b%i==0){
        gcd=i;                      // this is gcd calculation , if asked gcd then after this return gcd
      }
    }
    int max=a*b;
    int lc=max/gcd;             /// this is for lcd . lcd=(a*b)/gcd
    return lc;
   
    
  }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int b=sc.nextInt();
      int a=sc.nextInt();
      System.out.print(lcd(b,a));
    }
}
    


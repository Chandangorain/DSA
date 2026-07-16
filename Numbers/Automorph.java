package Numbers;
import java.util.*;
public class Automorph {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int result=n*n;
         int digit=result %100;
         if(n==digit){
          System.out.print("automorph");
         }else{
          System.out.print("not");
         }
         sc.close();
    }
}
    


/* remove special characters #% */


package String;
import java.util.Scanner;
public class RemCh {
 
  public static   String remove(String s){
    StringBuilder result=new StringBuilder();
    
    for(int i=0;i<s.length();i++){
      char ch=s.charAt(i);
      if((ch>='a' && ch<='z')||(ch>='A'&&ch<='Z')){
        result.append(ch);
      }
    }
    return result.toString();
  }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
        System.out.println(remove(s));
      
    }
}
    


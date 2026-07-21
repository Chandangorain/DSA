package String;
    import java.util.*;
public class Reverse {

  public static   String remove(String s){
    StringBuilder result=new StringBuilder();
    
    for(int i=s.length()-1;i>=0;i--){
      result.append(s.charAt(i));
    }
    return result.toString();
  }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      s=s.replace("\"","");
        System.out.println(remove("\""+s+"\""));
      
    }
}
    


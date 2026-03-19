import java.util.Scanner;

public class concat {
    public static void main (String []args){
         Scanner sc=new Scanner(System.in);
        System.out.println("enter your firstname:");
        String firstname = sc.nextLine();
        
        System.out.println("enter your lastname:");
       String lastname = sc.nextLine();
        
        String fullname=firstname+" "+lastname;
        System.out.println("full name is:"+fullname);
        

    }
    
    
}

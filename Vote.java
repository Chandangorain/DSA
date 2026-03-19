import java.util.Scanner;

public class Vote {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);  // for taking user input
    
         int age = sc.nextInt();        // scan the input 
        
        if(age>18){
            System.out.println("adult:vote sex");
        }else{
            System.out.println("child:no vote,sex");
        }
        sc.close();
    }
    
}

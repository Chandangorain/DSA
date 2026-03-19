import java.util.Scanner;

public class greater {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter A");
        int A=sc.nextInt();
        System.out.println("enter B");
        int B=sc.nextInt();
        if(A>=B){
            System.out.println("A is greater");
        }else{
            System.out.println("B is greater");
        }
        sc.close();

    }
    
}

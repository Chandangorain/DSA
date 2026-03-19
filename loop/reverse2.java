/*              reverse the input digit  */



import java.util.Scanner;
public class reverse2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value ");
        int n=sc.nextInt();      // n=1234
        int rev=0;              //  0
       
        while(n>0){
            int lastdigit=n%10;   //4
            rev=(rev*10)+lastdigit;  // rev=0*10+4=4
            n=n/10;                 // update new n = 1234/10=123
            
        }
       
        System.out.println(rev);
        sc.close();



    }
    
}

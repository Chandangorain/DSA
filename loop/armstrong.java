//   armstrong number 153=(1*1*1)+(5*5*5)+(3*3*3)

import java.util.Scanner;

public class armstrong {
        public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value ");
        int n=sc.nextInt();      
        int armsNum=n;  
        int sum=0;            
       
        while(n>0){
            int lastdigit=n%10;   // 153 %10=3 ;15%10=5; 1
            sum=sum+(lastdigit*lastdigit*lastdigit); // (3*3*3)+(5*5*5)+(1*1*1)
            n=n/10;                 
            
        }
        if(sum==armsNum){
            System.out.println("armstrong number");

        }else{
            System.out.println("not armstrong number");
        }
     
        sc.close();



    }
    
}


    


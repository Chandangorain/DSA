public class palindrome {             // same as reverse number code , only 2 change
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value ");
        int n=sc.nextInt();      
        int rev=0;              
        int dup=n;      // *** store n in dup variable
        while(n>0){
            int lastdigit=n%10;   
            rev=(rev*10)+lastdigit;  
            n=n/10;                 
            
        }
        if(dup==rev){                          // if duplicate value and rev val same , then it will be palindrome
            System.out.println("palindrome");   // n=121 , rev=121 , dup=n=121 so dup=rev . Palindrome
        }else{
            System.out.println("not palindrome");
        }
       
        
        sc.close();



    }
    
}

    


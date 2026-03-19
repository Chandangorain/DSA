   /*   sum of n  */

public class SumofN {
    public static int CalcSum(int n){
        if(n==1){
            return 1;  // fact of 0 =1
        }
        int Snm1=CalcSum(n-1);   // sum of (n-1)
        int Sn= n+Snm1;         // sum of N= n+sum of (n-1)
        return Sn;
    }
    public static void main(String []args){
        //int n=5;
        
        
        System.out.println("Sum of n:"+CalcSum(5)); 
    }
    
}

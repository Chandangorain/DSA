public class prime {
    public static boolean isPrime(int n){

        //for corner case
        if(n==2){
            return true;
        }

        boolean isPrime=true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isPrime=false;
                return isPrime;
            }
        }
        return isPrime;
        
    }
    public static void main(String[] args) {
    System.out.println(isPrime(11));
        
    }
    
}

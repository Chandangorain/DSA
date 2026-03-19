//   Prime number in a range 
public class prime2 {
    public static void primeinrange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                
                System.out.print(i+" ");
            }
        }
        System.out.println();

    }
    public static void main(String[] args) {
       System.out.println(primeinrange(20));
    }
    
}

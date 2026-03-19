 public class bc {
      public static int factorial(int n){    // factorial 
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;

        }
        return f;
    }
    public static int bincoff(int n,int r){  //call the factorail
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int fact_NmR=factorial(n-r);
        return fact_n / (fact_r * fact_NmR);   // nCr formula

    }
    public static void main(String[] args) {
        int n=5;
        int r=7;
        int bincoefficeint=bincoff(n,r);    // bincoefficient initialize 
        System.out.println(bincoefficeint);   // function call

    }
  
    
}

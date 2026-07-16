/*
count all the factors of a number
input: 12
output: 6
explanation: factors of 12 are 1,2,3,4,6,12
 */


package Numbers;
import java.util.*;
public class Countfactor {
    public static int countFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count;
    }

    /*
    for count prime factors of a number
    int count=0;
    for(int i=2;i*i<=n;i++){
    while(n%i==0){
    count++;
    n=n/i;
    }
    if(n>1){
    count++;
    }
    return count;
    }
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countFactors(n));
    }
    
}

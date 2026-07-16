package Numbers;
/*
count prime numbers 
input: 10
output: 4
ex

 */


import java.util.*;

public class Countprime {
  public static int prime(int n){
    int count=0;
    for(int i=2;i<n;i++){
      boolean isPrime=true;
      for(int j=2;j*j<=i;j++){
        if(i%j==0){
          isPrime=false;
          break;
        }
      }
      if(isPrime){
        count++;
        
      }
    }
    return count;
    
  }

  /*  
  if it said to return the number in array . then initialize a list and add(i) in list 
  ArrayList<Integer> list = new ArrayList<>();
...
....
..
if(isprime){
list.add(i);
}
return list;
  */
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      System.out.print(prime(n));
    }
}
    


/*
Problem Statement: Find permutations in which n people can occupy r seats in a classroom.

Examples
Input: N = 5, r = 3
Output: 60
*/

package Numbers;
import java.util.*;

public class Permutation {

  public static int fact(int x){
    int fact=1;
   for(int i=1;i<x;i++){
      fact=fact*i;      
   }
    return fact;
    
   
  }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int r=sc.nextInt();
     int result=fact(n)/fact(n-r);
     System.out.print(result);

    }
}
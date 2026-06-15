/*
handshake problem: In a group of n people, each person shakes hands with every other person exactly once. The task is to find the total number of handshakes that occur.
Example:
Input: n = 3
Output: 3
Explanation: Each person shakes hands with 2 others, resulting in a total of 3 hand

*/

import java.util.*;
public class Handshake{
    public static int countHandshakes(int n){
        if(n<2){
            return 0;
        }
        return (n*(n-1))/2;
    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
        System.out.println(countHandshakes(n));
    }
}
/*
int handhske=0;
for(inti=0;i<=n;i++){
for(int j=i+1;j<=n;j++){
handhske++;
}
}
System.out.println(handhske);
*/
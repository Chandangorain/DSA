/*
Buzz Number Check
Implement a function to check whether a given number is a Buzz number or not. A Buzz number is a number that ends with the digit 7 or is divisible by 7.

Examples

42 is a Buzz number because it is divisible by 7.
107 is a Buzz number because it ends with 7.
147 is a Buzz number because it ends with 7 and is also divisible by 7.

*/

package TCS;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		int n=Sc.nextInt();
		String s=String.valueOf(n);
		int right=s.length()-1;
		if(right==7){
		    System.out.println("buzznumber");
		}
		else if(n%7==0){
		    System.out.println("buzznumber");
		}
		else{
		   System.out.println("____");
		}
		
		
	}
    
}

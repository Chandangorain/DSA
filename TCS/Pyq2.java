/*
Given a string S consisting of * and #. The length of the string is variable. The task is to find the minimum number of * or # required to make it a valid string. The string is considered valid if the number of * and # are equal. The * and # can be at any position in the string.

Note: The output will be a positive or negative integer based on the number of * and # in the input string.

If * > # : output a positive integer
If # > * : output a negative integer
If # = * : output 0

*/

 import java.util.*;
public class Pyq2 {
   



  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    int star=0;
    int hash=0;
    for(int i=0;i<s.length();i++){
       char ch=s.charAt(i);
       if(ch=='*'){
        star++;
       }
       if(ch=='#'){
        hash++;
       }
    }
       System.out.println(star-hash); 
    
   
   
    
  }
}
    
    


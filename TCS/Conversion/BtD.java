package Conversion;
 import java.util.*;
public class BtD {
  public static int fact(String s ){
    int ans=0;
    int base=1;
    for(int i=s.length()-1;i>=0;i--){
      if(s.charAt(i)=='1'){
        ans=ans+base;
      }
      base=base*2;
    }
    return ans;
  }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
 
    System.out.print(fact(s));
    sc.close();

    }
    
}



/*
USE BUILT IN FUNCTION

import java.util.*;
public class Main {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         String s=sc.nextLine();
         int decimal=Integer.parseInt(s,2);
         System.out.print(decimal);
         }
    }



*/
    


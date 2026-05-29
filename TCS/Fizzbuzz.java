/*
fizzbuzz nuber , leetcode 412
input: n=3
output: ["1","2","Fizz"]
Explanation: For n = 3, the output is ["1","2","Fizz"] because 1 is not a multiple of 3 or 5, so it is represented as "1".
2 is also not a multiple of 3 or 5, so it is represented as "2". However, 3 is a multiple of 3, so it is represented as "Fizz".

*/

import java.util.*;

public class Fizzbuzz {
    
    public static List<String> fizzBuzz(int n) {
        List<String>ans=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%5==0 && i%3==0){
                ans.add("FizzBuzz");
            }else if(i%3==0){
                ans.add("Fizz");
            }else if(i %5==0){
                ans.add("Buzz");
            }else{
                ans.add(String.valueOf(i));
            }
        }
        return ans;

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<String>ans=fizzBuzz(n);    // not only String ans=fizzbuzz(ans) becz method return list of string 
        System.out.println(ans);
    }

    
}

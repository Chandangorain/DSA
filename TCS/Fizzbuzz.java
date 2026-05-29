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

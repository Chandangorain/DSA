/*
postfix evaluation
*/

import java.util.*;
public class Postfix {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        String[]parts=s.split(" ");
        Stack<Integer>st=new Stack<>();
        for(String token:parts){
          if(token.equals("+")||token.equals("-")||token.equals("*")||token.equals("/")){
            int b=st.pop();
            int a=st.pop();
            int result=0;
            if(token.equals("+")){
              result=a+b;
            }
            if(token.equals("-")){
              result=a-b;
            }
            if(token.equals("*")){
              result=a*b;
            }
            if(token.equals("/")){
              result=a/b;
            }
            st.push(result);

          }else{
            st.push(Integer.parseInt(token));
          }
        }
        System.out.print(st.pop());
        sc.close();
    }
}
    


import java.util.*;
public class ValidParan {
      public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }else{
                if(st.isEmpty()){
                    return false;
                }
                if(st.peek()=='(' && ch==')'            // opening is the peek
                    || st.peek()=='{' && ch=='}'
                    || st.peek()=='[' && ch==']'){

                        st.pop();
                    }
                    else{
                    return false;
                }
            }

        }
        if(st.isEmpty()){
            return true;
        }else{
            return false;
        }
        
    }
        
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.replace("\"","");   // this is for removing the double quotes from the input string
        ValidParan vp=new ValidParan();
        System.out.println(vp.isValid(s));

    }
    
}

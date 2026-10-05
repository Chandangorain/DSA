//leetcode 856
/*Given a balanced parentheses string s, return the score of the string.

The score of a balanced parentheses string is based on the following rule:

"()" has score 1.
AB has score A + B, where A and B are balanced parentheses strings.
(A) has score 2 * A, where A is a balanced parentheses string.

Example 1:

Input: s = "()"
Output: 1
Example 2:

Input: s = "(())"
Output: 2

input = (()())
output = 4   [becz: (a)2*a ; (2)=2*2=4]

*/
package String;

import java.util.Stack;

public class CountParanthesis {
    public static int count(String s){
        Stack<Integer>stack=new Stack<>();
        stack.push(0);
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                stack.push(0);
            }else{
                int curr=stack.pop();
                if(curr==0){
                    curr=1;
                }else{
                    curr=2*curr;
                }
                int previous = stack.pop();
                stack.push(previous + curr);
            }
        }
            return stack.peek();
    }
    public static void main(String[] args) {
        String s = "(()(()))";
        int result = count(s);
        System.out.println("The score of the parentheses string is: " + result);
        
    }

    
}

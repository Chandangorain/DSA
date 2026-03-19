
import java.util.*;
public class palindrome
{
    
    public static boolean isPalindrome(String s){
        
       int left=0;
       int right=s.length()-1;
       while(left<right){
           while(left<right && !Character.isLetterOrDigit(s.charAt(left))){  // isLetterOrDigit checks if the character is a letter or a digit. and if not in this then skip it 
               left++;
           }
           while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
               right--;
           }
           
           char ch=Character.toLowerCase(s.charAt(left));       //converts into lowercase and then compare it with the right one
           char gh=Character.toLowerCase(s.charAt(right));
           if(ch!=gh){
               return false;
           }
           left++;      // if both are same then move the left and right pointer
           right--;
       }
       return true;
        
    }
    
    
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();
		System.out.println(isPalindrome(s));
	}
}
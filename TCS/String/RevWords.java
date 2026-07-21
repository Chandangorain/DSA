// reverse words

package String;
import java.util.Scanner;
public class RevWords {
    public static String reverse(String s){
        String[]words=s.split(" ");
        StringBuilder result=new StringBuilder();
        for(int i=words.length;i>=0;i--){
            result.append(words[i]);
            if(i!=0){
                result.append(" ");
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(reverse(s));
    }
    
}

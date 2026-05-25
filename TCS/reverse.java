//reverse the words in a given string

// sample input: "Hello World"
// sample output: "World Hello"


import java.util.*;

public class reverse {
    public static String Reversewords(String s){
        s=s.trim();                                 // Remove leading and trailing spaces from the input string
        String[]words=s.split("\\\s+");
        String result="";
        for(int i=words.length-1;i>=0;i--){
            result+=words[i];
            if(i!=0){       // To avoid adding an extra space at the end
                result+=" ";        // Add a space after each word except the last one
            }
        }
        return result;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String ans=Reversewords(s);
        System.out.println(ans);
    }

}
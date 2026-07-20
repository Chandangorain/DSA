/*
remove the common part
s1=computer
s2=cat
output=mpuer
*/


package String;
 import java.util.Scanner;
public class RemCommon {
   
    public static String removeSpaces(String s1,String s2) {

        String ans="";
        for(int i=0;i<s1.length();i++){
          boolean found=false;
          for(int j=0;j<s2.length();j++){
            if(s1.charAt(i)==s2.charAt(j)){
              found=true;
              break;

            }
           
          }
           if(!found){
              ans=ans+s1.charAt(i);
            }

        }
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        System.out.println(removeSpaces(s1,s2));
    }
}
    


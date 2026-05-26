import java.util.*;
public class Anagram
{
    
    public static boolean isAnagram(String s, String t){
        
        int m=s.length();
        int n=t.length();
        
        if(m!=n){
            return false;
        }
        else{
            int count[]=new int[26];
            for(int i=0;i<m;i++){
                count[s.charAt(i)-'a']++;
            }
            for(int i=0;i<n;i++){
                count[t.charAt(i)-'a']--;
            }
            for(int i=0;i<count.length;i++){    // check if empty or not , empty means all were same then anagram 
                if(count[i]!=0){
                    return false;
                }
            }
            return true;
        }
        
    }
    
    
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String t=sc.nextLine();
		 s = s.replace("\"", "");
        t = t.replace("\"", "");
		System.out.println(isAnagram(s, t));
	}
    
}
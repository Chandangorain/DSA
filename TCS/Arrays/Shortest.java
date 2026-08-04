/* leetcode 821 

Input: s = "loveleetcode", c = "e"
Output: [3,2,1,0,1,0,0,1,2,2,1,0]
Explanation: The character 'e' appears at indices 3, 5, 6, and 11 (0-indexed).
*/
package Arrays;
import java.util.*;
class Shortest {
    public static int[] shortestToChar(String s, char c) {
        int n=s.length();
        int[]ans=new int[n];
        for(int i=0;i<n;i++){
            int ls=Integer.MAX_VALUE;
            int rs=Integer.MAX_VALUE;

            // searching left side
            for(int j=i;j>=0;j--){
                if(s.charAt(j)==c){
                    ls=i-j;
                    break;
                }
            }
            //searching right side
            for(int j=i;j<n;j++){
                if(s.charAt(j)==c){
                    rs=j-i;
                    break;
                }
            }
            //now take min distance of both
            ans[i]=Math.min(ls,rs);
        }
        return ans;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char c=sc.next().charAt(0);
        int[]ans=shortestToChar(s,c);
        System.out.println(Arrays.toString(ans));}
        
    }

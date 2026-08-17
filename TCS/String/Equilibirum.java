/*
You are given a string S containing lowercase English letters.
input=abac
output=2 
explanation : for 2 index element=a, leftsum=a+b=3, rightsum=c=3

*/

package String;

public class Equilibirum {
    public static int stock(String S) {

    for (int i = 0; i < S.length(); i++) {

        char ch = S.charAt(i);
        int val = ch - 'a' + 1;

        int leftsum = 0;
        int rightsum = 0;

        // Left side: index 0 to i-1
        for (int j = 0; j < i; j++) {
            char leftCh = S.charAt(j);
            leftsum += leftCh - 'a' + 1;
        }

        // Right side: index i+1 to end
        for (int j = i + 1; j < S.length(); j++) {
            char rightCh = S.charAt(j);
            rightsum += rightCh - 'a' + 1;
        }

        if (leftsum == rightsum) {
            return i;
        }
    }

    return -1;
}
    public static void main(String[] args) {
        String S = "abac";
        int result = stock(S);
        System.out.println(result);
    }
    
}

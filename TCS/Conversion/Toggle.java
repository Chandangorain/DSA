/*
quesion is following step:
input:12
 convert it into binary: 1100
 toggle the binary: 0011
 convert it decimal: 3
 output:3

*/


package Conversion;
 import java.util.*;
public class Toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String binary = Integer.toBinaryString(n);      //decimal to binary 
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < binary.length(); i++) {
            if(binary.charAt(i) == '1') {       //toggle the binary . if 1 then 0 , if 0 then 1 . save it in stringbuilder
                sb.append('0');
            } else {
                sb.append('1');
            }
        }
        String toggle = sb.toString();         //convert stringbuilder to string
        int decimal = Integer.parseInt(toggle, 2);      //convert binary to decimal
        System.out.println(decimal);
        sc.close();
    }
}
    


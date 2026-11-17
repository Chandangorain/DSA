/*Reverse Only Letters
lc 917
Input: s = "ab-cd"
Output: "dc-ba"
 logic: if charactet !=letter , then skip else swap the letters

*/
package Twopointer;

public class Reverse {
    public static String reverseOnlyLetters(String s) {
        char[]arr=s.toCharArray();
        int left=0;
        int right=arr.length-1;
        while(left<right){
            if(!Character.isLetter(arr[left])){
                left++;
            }
            else if (!Character.isLetter(arr[right])) {
            right--;
            }
            else{
                char temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }

        }
        return new String(arr);

        
    }
    public static void main(String[] args) {
        Reverse reverse = new Reverse();
        String s = "ab-cd";
        String result = reverse.reverseOnlyLetters(s);
        System.out.println("Reversed string: " + result);
    }
    
}

/*

Question

You are given an integer array ARR of size N and two integers X and Y.

For every pair of indices (i, j):

Convert ARR[i] and ARR[j] to strings.
Concatenate them in the order ARR[i] followed by ARR[j].
Convert the resulting string back to an integer.
If this integer lies in the range [X, Y] (inclusive), the pair is considered valid.

Count the total number of valid pairs.

Note
Pairs (i, j) and (j, i) are counted separately if both are valid.

input:
n=5
arr=[2,5,7,6,3];
x=20;
y=50;
output:8(25,27,26,23,32,35,37,36)
*/

package TCS;

public class Q5 {
    public static int validpairs(int[]arr,int x,int y){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                String s1=Integer.toString(arr[i]);     // arr to string conversion
                String s2=Integer.toString(arr[j]);
                String combined=s1+s2;          // concatenate the two strings      
                int num=Integer.parseInt(combined);         // convert the combined string back to an integer
                if(num>=x && num<=y){
                    count++;
                }
            }

        }
        return count;

        
    }
    public static void main(String[]args){
        int n=5;
        int []arr={2,5,7,6,3};
        int x=20;
        int y=50;
        int result=validpairs(arr,x,y);
        System.out.println(result);
    }
    
}

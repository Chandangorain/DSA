/*
lc 2485
find the pivot index of an array
Input: n=8
output: 6
Explanation:  1 + 2 + 3 + 4 + 5 + 6 = 6 + 7 + 8 = 21.
sum 1->pivot == pivot->end , return i 
*/
package Arrays;
public class Pivot {
    public static int pivotInteger(int n) {
       for(int i =1;i<=n;i++){
        int sum1=0;
        int sum2=0;
        // sum: 1->pivot
        for(int j=1;j<=i;j++){
            sum1+=j;
        }
        // sum : pivot ->end
        for(int j=i;j<=n;j++){
            sum2+=j;
        }
        if(sum1==sum2){
            return i;
        }
       }
       return -1;
    }
    public static void main(String[] args) {
        Pivot pivot = new Pivot();
        int n = 8;
        int result = pivot.pivotInteger(n);
        System.out.println("Pivot index: " + result);
    }
    
}

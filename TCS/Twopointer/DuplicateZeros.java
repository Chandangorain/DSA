/* lc1089
Input: arr = [1,0,2,3,0,4,5,0]
Output: [1,0,0,2,3,0,0,4]
Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
*/


package Twopointer;
public class DuplicateZeros {
    public static int duplicateZeros(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                for(int j=n-1;j>i;j--){
                    arr[j]=arr[j-1];
                }
                i++;
            }
        }
        return 0;   
    }
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeros(arr);
        System.out.print("Array after duplicating zeros: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    
}

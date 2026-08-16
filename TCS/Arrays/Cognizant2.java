/*Red Pen Green Pen

You are a teacher creating an engaging math activity for your students by writing N numbers on the classroom whiteboard. You use a green pen for odd numbers and a red pen for even numbers.

Your task is to find and return an integer value representing the number of times you need to switch from the green pen to the red pen while writing these numbers. */
// input:[1,3,5,2,4,6,7,9]
//output: 1
//exlation: 1 switch from green to red pen occurs between 5 and 2.

package Arrays;
public class Cognizant2 {
    public static int penSwitch(int[] arr, int n) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            if ( (arr[i - 1] % 2 != 0 && arr[i] % 2 == 0)) {        // if prev is odd and next is even then switch from green to red
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 4, 6, 7, 9};
        int n = arr.length;
        System.out.println(penSwitch(arr, n));
    }
    
}

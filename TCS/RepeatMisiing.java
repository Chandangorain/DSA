/*
find repeat and missing element
input:[1,2,3,5,6,6]
output:[6,4]
Explanation: The number 6 is repeated, and the number 4 is missing from the array
*/



import java.util.*;
public class RepeatMisiing {
    public static int[] findMissingAndRepeating(int[] arr) {
        int n = arr.length;
        
        // Create a frequency array of size N + 1 (since numbers range from 1 to N)
        // Automatically initialized with 0s
        int[] count = new int[n + 1];  // n+1 because we want to use 1-based indexing for convenience
        
        // Step 1: Count the occurrences of each element
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }
        
        int repeating = -1;
        int missing = -1;
        
        // Step 2: Scan the count array from 1 to N
        for (int i = 1; i <= n; i++) {
            if (count[i] == 2) {
                repeating = i; // Appeared twice
            } else if (count[i] == 0) {
                missing = i;   // Never appeared
            }
        }
        
        return new int[]{repeating,missing};
       
        //System.out.println( missing);
    }

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       String[]parts=s.split(",");
       int[]nums=new int[parts.length];
       for(int i=0;i<parts.length;i++){
        nums[i]=Integer.parseInt(parts[i]);
       }
       System.out.println(Arrays.toString(findMissingAndRepeating(nums)));
    }
}
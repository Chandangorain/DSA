//subarraysum equals k

import java.util.*;

public class subsumeqk {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input value of k
        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        // HashMap to store (prefixSum, frequency)
        HashMap<Integer, Integer> map = new HashMap<>();

        // Important: Put (0,1) to handle case when subarray starts from index 0
        map.put(0, 1);

        int sum = 0;   // To store prefix sum
        int ans = 0;   // To store total number of subarrays with sum = k

        // Traverse array
        for (int j = 0; j < arr.length; j++) {

            sum += arr[j];   // Calculate prefix sum

            // Check if (sum - k) exists in map
            if (map.containsKey(sum - k)) {
                ans += map.get(sum - k);   // Add its frequency to answer
            }

            // Update frequency of current prefix sum
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        // Print result
        System.out.println("Number of subarrays with sum " + k + " is: " + ans);
    }
}


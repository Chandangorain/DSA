/* nums1[]=[1,2,3,0,0,0],
nums2[]=[2,5,6]   

output =[1,2,2,3,5,6]

 */

import java.util.*;

class Main {

    public static void mergearray(int nums1[], int nums2[], int m, int n) {

        int i = m - 1;      // last pointer of nums1 . i=3
        int j = n - 1;      // last pointer of nums2. i=6
        int k = m + n - 1;  // last pointer of new arr of combined nums1+nums2

        while (j >= 0) {

            if (i >= 0 && nums1[i] > nums2[j]) { 
                nums1[k] = nums1[i];
                i--;
            } 
            else {          // 3<6 
                nums1[k] = nums2[j];  // then store 6 in the last idx of combined arr
                j--;   //then decrease , now j = 5
            }

            k--;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // input number of elements in nums1 (valid elements only)
        int m = sc.nextInt();

        // input number of elements in nums2
        int n = sc.nextInt();

        // nums1 must have extra space of size m+n
        int nums1[] = new int[m + n];

        // input elements of nums1
        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }

        // input nums2
        int nums2[] = new int[n];

        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }

        // call merge function
        mergearray(nums1, nums2, m, n);

        // print merged array
        for (int i = 0; i < m + n; i++) {
            System.out.print(nums1[i] + " ");
        }
    }
}
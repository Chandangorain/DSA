/*
find median
if number of elements odd then return the mid elements or if even the avg of the mid and adjacent elements
input:[2,5,1,7]
output: 3.5
input:[2,5,1,7,3]
output: 3
*/



package Arrays;
import java.util.*;
public class Median {
    
    public static double median(int[] nums) {

        Arrays.sort(nums);

        int n = nums.length;
        int mid = n / 2;

        if (n % 2 == 0) {
            return (nums[mid] + nums[mid - 1]) / 2.0;
        } else {
            return nums[mid];
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        s = s.replace("[", "");
        s = s.replace("]", "");

        String[] parts = s.split(",");

        int[] nums = new int[parts.length];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(parts[i].trim());
        }

        System.out.print(median(nums));

        sc.close();
    }
}
    
class Solution {
    public int pivotIndex(int[] nums) {

        // This will store the total sum of all elements in the array
        int totalSum = 0;

        // Loop to calculate the total sum of the array
        for (int num : nums) {
            totalSum += num;   // add each element to totalSum
        }

        // This will store the sum of elements on the left side
        int leftSum = 0;

        // Loop through the array to find the pivot index
        for (int i = 0; i < nums.length; i++) {

            // Right sum is total sum minus left sum minus current element
            int rightSum = totalSum - leftSum - nums[i];

            // Check if left sum equals right sum
            if (leftSum == rightSum) {
                // If equal, current index is the pivot index
                return i;
            }

            // Add current element to left sum for next iteration
            leftSum += nums[i];
        }

        // If no pivot index is found, return -1
        return -1;
    }
}

// leecode 1013
/*
Partition Array Into Three Parts With Equal Sum
Example 1:

Input: arr = [0,2,1,-6,6,-7,9,1,2,0,1]
Output: true
Explanation: 0 + 2 + 1 = -6 + 6 - 7 + 9 + 1 = 2 + 0 + 1
*/

class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int totalsum=0;
        for(int i=0;i<arr.length;i++){
            totalsum+=arr[i];
        }
        if(totalsum %3 !=0){
            return false;
        }

        int target=totalsum/3;   // so when the arr sum ==trget count++, 1 arr done like this. thus when count=3 means three arr done -- > true
        int sum=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==target){
                count++;
                sum=0;//reset sum
            }
            if(count==3){
                return true;        // 3 arr found
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1};
        boolean result = solution.canThreePartsEqualSum(arr);
        System.out.println("Can the array be partitioned into three parts with equal sum? " + result);
    }
}
/*    remove delete elements .                      // Leetcode 26
      input []={0,0,3,3,5,6}
      output=4(unique elements) delete the duplicate
 */




public class TUF {
    public static int removeduplicate(int [] nums){
        if(nums.length==0){
            return 0;
        }
        int i=0;                        // pointer for unique elements
        for(int j=0;j<nums.length;j++){
            if(nums[i]!=nums[j]){           // if doesn't match with previous element ..increment i
                i++;
                nums[i]=nums[j];            // update 
            }
        }
        return i+1;             //if i=0 then only 1 unique elements
       

        }
         public static void main(String []args){
            int nums[]={0,0,3,3,5,6};
            int k=removeduplicate(nums);

            System.out.println("unique elements:" +k);

    }
    
}










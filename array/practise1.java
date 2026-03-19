    /*  if there is an duplicate element print true
     *
     */


public class practise1 {
   public static boolean containsDuplicate(int[] nums) {
    for(int i=0; i<nums.length; i++) {          // loop through each element
        for(int j=i+1; j<nums.length; j++) {      // compare with every next element
            if(nums[i] == nums[j]) {              // if any two elements are equal
                return true;                      // duplicate found
            }
        }
    }
    return false; // no duplicate found
}

public static void main(String args[]){
    int nums[]={1,2,3,4};
    System.out.println(containsDuplicate(nums));

}
    
}

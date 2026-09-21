/*Leetcode 179
return the possible largest number
Input: nums = [3,30,34,5,9]
Output: "9534330"
3 and 30
330 > 303
→ 3 comes first

5 and 34
534 > 345
→ 5 comes first

Final order:
9, 5, 34, 3, 30

Answer:
9534330
*/
package String;
import java.util.*;
public class Largest {

    public static String largest(int[]nums){
        String[]arr=new String[nums.length]; // create a string array
        for(int i=0;i<nums.length;i++){
            arr[i]=String.valueOf(nums[i]);  // convert every number into string
        }

        Arrays.sort(arr,(a,b) ->{   // sort using codition 
            String first=a+b;   // if a+b>b+a then put a before b else put b first
            String second=b+a;
            return second.compareTo(first);   // Put the larger combination first
        });

        if(arr[0].equals("0")){
            return "0";
        }
        StringBuilder result=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            result.append(arr[i]);  // join all string
        }
        return result.toString();

    }
    public static void main(String[] args) {
        
    }
}

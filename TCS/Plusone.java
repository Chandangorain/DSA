/*
input: [1,2,3]
output: [1,2,4]
*/
import java.util.*;
public class Plusone
{   
    public static int[] plusone(int[]nums){
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]<9){
                nums[i]++;
                return nums;
            }
            nums[i]=0;
        }
        int[]result=new int[nums.length+1];
        result[0]=1;
        return result;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		s=s.replace("[","");
		s=s.replace("]","");
		String[]parts=s.split(",");
		int[]array=new int[parts.length];
		for(int i=0;i<parts.length;i++){
		    array[i]=Integer.parseInt(parts[i].trim());
		}
		System.out.println(Arrays.toString(plusone(array)));
	}
}
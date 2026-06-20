/*
merge two sorted array
nums1=[1,2,3]
nums2=[2,5,6]
output:[1,2,2,3,5,6]
*/




import java.util.*;
public class Merge
{
    public static int[] twosum(int []nums1,int[]nums2){
        int n=nums1.length;
        int m=nums2.length;
        int[]result=new int[m+n];
        int k=0;
        for(int i=0;i<n;i++){
            result[k]=nums1[i];
            k++;
        }
        for(int j=0;j<m;j++){
            result[k]=nums2[j];
            k++;
        }
        Arrays.sort(result);
        return result;
     
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		s1=s1.replace("[","");
		s1=s1.replace("]","");
		String[]parts1=s1.split(",");
	    int[]nums1=new int[parts1.length];
	    for(int i=0;i<parts1.length;i++){
	        nums1[i]=Integer.parseInt(parts1[i].trim());
	        
	    }
	     String s2 = sc.nextLine();
        s2 = s2.replace("[", "");
        s2 = s2.replace("]", "");
        String[] parts2 = s2.split(",");
        int[] nums2 = new int[parts2.length];

        for (int i = 0; i < parts2.length; i++) {
            nums2[i] = Integer.parseInt(parts2[i].trim());
        }

        System.out.println(Arrays.toString(twosum(nums1, nums2)));
		
	}
}
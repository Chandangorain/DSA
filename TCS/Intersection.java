import java.util.*;
public class Intersection
{
    
    public static int[] insertion(int[]nums1,int[]nums2){
        int m=nums1.length;
        int n=nums2.length;
        Set<Integer>set=new HashSet<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(nums1[i]==nums2[j]){
                    set.add(nums1[i]);
                }
            }
        }
        int[]result=new int[set.size()];
        int idx=0;
        for(int num:set){
            result[idx]=num;
            idx++;
        }
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
        int[] numHs2 = new int[parts2.length];

        for (int i = 0; i < parts2.length; i++) {
            nums2[i] = Integer.parseInt(parts2[i].trim());
        }

        System.out.println(Arrays.toString(insertion(nums1, nums2)));
	}
}
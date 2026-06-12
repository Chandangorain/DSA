import java.util.*;
public class Rotate{
    public static void rotatearray(int[]nums,int k){
        int n=nums.length;
        k=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
    public static void reverse(int[]nums,int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    int k=sc.nextInt();
    s=s.replace("[","");
    s=s.replace("]","");
    String[]parts=s.split(",");
    int[]arr=new int[parts.length];
    for(int i=0;i<parts.length;i++){
        arr[i]=Integer.parseInt(parts[i]);

    }
    rotatearray(arr,k);
    System.out.println(Arrays.toString(arr));
}
   

}
package Arrays;
    import java.util.*;

public class KthSmallest {
  public static int operation(int[]arr,int k){
    Arrays.sort(arr);
    int count=1;
    if(k==1){
      return arr[0];
    }
    for(int i=1;i<arr.length;i++){
      if(arr[i-1]!=arr[i]){
        count++;
      }
      if(count==k){
        return arr[i];
      }
    }
    return -1;

  }
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     String s=sc.nextLine();
     s=s.replace("[","");
     s=s.replace("]","");
     String[]parts=s.split(",");
     int[]arr=new int[parts.length];
     for(int i=0;i<arr.length;i++){
      arr[i]=Integer.parseInt(parts[i].trim());
     }
     int k=sc.nextInt();
     System.out.print(operation(arr,k));
     sc.close();
    }
}
    

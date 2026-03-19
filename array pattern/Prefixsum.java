import java.util.*;
public class Prefixsum {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);

            System.out.println("enter the number of elements in the array:");
        int n=sc.nextInt();

        int[] arr=new int[n];   // create array

        System.out.println("enter"+n+"elements");  // take array input
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int[]prefix=new int[n]; // create prefix array
        prefix[0]=arr[0];

        for(int i=1;i<n;i++){  //build prefix sum
            prefix[i]=prefix[i-1]+arr[i];
        }
        System.out.println("prefix sum array:");
        for(int i=0;i<n;i++){
            System.out.println(prefix[i]+" ");
        }
        sc.close();
    }

    
}

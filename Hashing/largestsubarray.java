//largest subarray sum=0
//[15,-2,2,-8,1,7,10,23]   =>5(-2,2,-8,1,7)

import java.util.*;
public class largestsubarray {
     public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n]; //create new arr of size n
        for(int i=0;i<n;i++){ //input arr elemnts
            arr[i]=sc.nextInt();
        }

        HashMap<Integer,Integer>map=new HashMap<>();
        int sum=0;
        int len=0;
        for(int j=0;j<n;j++){
            sum+=arr[j];  //sum of subarrays
            if(map.containsKey(sum)){   //if sum exits then calc the len=(j-i)=>max(len,j-i)
                len=Math.max(len,j-map.get(sum)); //here i=map.get(sum)
            }else{
                map.put(sum, j);  //if doesn't exist then store it in map
            }
        }
        System.out.println("longest array:"+len);
        sc.close();
     }
}

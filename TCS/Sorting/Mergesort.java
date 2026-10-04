package Sorting;

public class Mergesort {
    public static void mergesort(int[]arr,int low,int high){
        if(low<high){
            int mid=low+(high-low)/2;
            mergesort(arr,low,mid);
            mergesort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }
    public static void merge(int[]arr,int low,int high,int mid){
        int i=low;
        int j=mid+1;
        int k=0;
        int[]temp=new int[high-low+1];
        while(i<=mid && j<=high ){
            if(arr[i]<arr[j]){
                temmp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
          // Copy remaining elements from left half
        while(i<=mid){
            temp[k]=arr[i];
            i++;
            k++;
        }
        // Copy remaining elements from right half
        while(j<=high){
            temp[k]=arr[j];
            j++;
            k++;
        }
        // Copy the merged elements back to the original array
        for(int x=0;x<temp.length;x++){
            arr[low+x]=temp[x];
        }
    }
    public static void main(String[]args){
        int[]arr={5,4,3,2,1};
        mergesort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}

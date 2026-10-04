package Sorting;

public class Quicksort {
    // partition function 

    public static int partition(int[]arr,int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;//creating a blank space for the pivot element to be placed in the correct position
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }
    public static void quicksort(int[]arr,int low,int high){

        if(low<high){
            int pivotidx=partition(arr,low,high);
            quicksort(arr,low,pivotidx-1);  //sort left part
            quicksort(arr,pivotidx+1,high); //sort right part
        }


    }
    public static void main(String[]args){
        int[]arr={5,4,3,2,1};
        quicksort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}

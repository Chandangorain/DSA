public class binarysearch {
    public static int binarySearch(int numbers[],int key){
        int st=0;
        int end=numbers.length-1;
        while(st<=end){
            int mid=(st+end)/2;         // mid calc

            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){       // right shift
                st=mid+1;
            }else{
                end=mid-1;              // left shift
            }

           
        }
         return -1;

       
        }
         public static void  main(String args[]){
            int numbers[]={10,20,30,40};
            int key=30;
            System.out.println("index is" +binarySearch(numbers,key));
    }
    
}

public class subarray {
    public static void printSubarrays(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            int start =i;                         //start
            for(int j=i;j<numbers.length;j++){
                int end=j;                         //end
                for(int k=start;k<=end;k++){              // subrray starts with k from start to end
                    System.out.println(numbers[k]+" ");   //subarray print
                }
            }
            
        }
        
    }
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10};
        printSubarrays(numbers);
    }
    
}

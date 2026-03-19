public class largest {

    public static void getLargest(int numbers[]){
        int largest=Integer.MIN_VALUE;

        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
        }
        return largest;

        
        
    }
    public static  main(String args[]){
        int numbers[]={10,20,304,50};
        System.out.println("largest number is "+ getLargest(numbers));

    }
    
}

class pp {
    public static void reverse(int numbers[]){
        int st=0;
        int end=numbers.length-1;
        while(st<end){
            int temp=numbers[end];
             numbers[end]=numbers[st];
             numbers[st]=temp;
            st++;
            end--;
        }
    }
    public static void main(String args[]){
        int numbers[]={1,3,5,6,8,9};
        reverse(numbers);
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
            //stem.out.println();
        
    }
        
  
}
}
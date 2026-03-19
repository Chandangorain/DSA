import java.util.*;
public class linear {
    public static int linearSearch(int numbers[],int key){  // linearsearch function initialize
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }


    public static void main(String args[]){
        int numbers[]={10,20,25,30,35,40,45};
        int key=20;

        int index=linearSearch(numbers, key);   // call the linearsearch array
        if(index==-1){
            System.out.println("not found , try again");
        }else{
            System.out.println("number at index" +index);
        }

        System.out.println();
    }
    
}

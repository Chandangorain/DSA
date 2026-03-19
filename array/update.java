
   // update the marrks

//import java.util.*;

public class update {
    public static void updatemarks(int marks[]){      // update function call
        int n=marks.length;
        for(int i=0;i<n;i++){
            marks[i]=marks[i]+1;    // updation of marks
        }

    }
    public static void main(String args[]){
        int marks[]={97,98,99};             
        updatemarks(marks);             // update function call 
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]+" ");
        }
    }

   
    
}

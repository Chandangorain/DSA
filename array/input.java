import java.util.*;

public class input {
    public static void main(String args[]){
        int marks[]=new int[100];
        Scanner sc= new Scanner(System.in);

        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        marks[3]=sc.nextInt();

        System.out.println("marks in physics=" +marks[0]);
        System.out.println("marks in chem=" +marks[1]);
        System.out.println("marks in math=" +marks[2]);
        sc.close();






    }
    
}

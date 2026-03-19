import java.util.Scanner;

public class search {

    public static boolean SearchIndex(int matrix[][], int key){            // boolean search for key element  
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
               if(matrix[i][j]==key){
                System.out.println("found at cell("+i+","+j+")");
                return true;
               }
            }
        }
        System.out.println("not found");
        return false;

    }
    public static void main(String[]args){
        int matrix[][]=new int [3][3];
        int n=matrix.length ;  // rows
         int m=matrix[0].length;  // coloumns

        Scanner sc=new Scanner(System.in);        // taking input from user
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();    //
            }
        }

        // output
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        SearchIndex(matrix,5);
        sc.close();

    }
}

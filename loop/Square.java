  /*
   * * * *
   * * * *
   * * * *
   * * * *
   */



import java.util.Scanner;
   public class Square {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");     // if we used println here then the star print goes to next line not in that row
            }
            System.out.println();

            
        }
        sc.close();

    }
    
}

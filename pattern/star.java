import java.util.Scanner;

public class star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {          // outer loop for rows
            for (int j = 1; j <= i; j++) {      // inner loop prints stars equal to row number
                System.out.print("* ");
            }
            System.out.println(); // move to next line after each row
        }

        sc.close();
    }
}

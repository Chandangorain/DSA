/* 
Arrange the Players ⚽

You are given the names and scores of N players.

Players should be ranked according to:

Higher score first.
If scores are equal, shorter name first.
If both score and name length are equal, alphabetical order.
Input
5
Rahul 80
Amit 90
Riya 80
Sam 90
Raj 80
Output
Amit 90
Sam 90
Raj 80
Riya 80
Rahul 80
*/


package Arrays;
import java.util.*;

public class Arrangement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Number of players
        int n = sc.nextInt();

        // Store name and score
        String[][] players = new String[n][2];
        for (int i = 0; i < n; i++) {
            players[i][0] = sc.next();          // name
            players[i][1] = sc.next();          // score
        }

        // Sort according to the given conditions
        Arrays.sort(players, (a, b) -> {

            int scoreA = Integer.parseInt(a[1]);
            int scoreB = Integer.parseInt(b[1]);
            if(scoreA!=scoreB){
                return scoreB-scoreA;
            }
            if(a[0].length()!=b[0].length()){       // shorter name first
                return a[0].length()-b[0].length();
            }
            return a[0].compareTo(b[0]);    // alphabetical sort

        });
        for(int i=0;i<n;i++){
            System.out.println(players[i][0]+" "+players[i][1]);

        }
        sc.close();


    }
    
}

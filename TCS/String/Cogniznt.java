/*
Given a list of names, determine the number of names in that list for which a given query string is a prefix. The prefix must be at least 1 character shorter than the entire name string.
input : 4
jackson
jacques
jack
jackma
jack
query:jack
output : jackson , jackma
 */



package String;
import java.util.*;
public class Cogniznt {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
        }
        String query = sc.next();
        for (int i = 0; i < n; i++) {

            // Check if the name is longer than the query
            // AND the name starts with the query
            if (names[i].length() > query.length()
                    && names[i].startsWith(query)) {
                System.out.println(names[i]);
            }
        }
    }
}
    


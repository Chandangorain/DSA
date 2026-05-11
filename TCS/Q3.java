/*
Question:
Given a list of strings representing different words, remove duplicates and print the unique words in ascending and descending order.
Input should be taken from the user.

Example Input:
Watermelon, Apple, Orange, Banana, Brange, Lemon, Apple
Example Output:
Unique words in ascending order: Apple, Banana, Brange, Lemon, Orange, Watermelon
*/
import java.util.*;
public class Q3 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String []words=s.split(",");    // Split the input string into an array of words by split commas
        TreeSet<String>set=new TreeSet<>();         // tree set is used to store unique words in sorted order
        for(int i=0;i<words.length;i++){
            set.add(words[i].trim());           // trim is used to remove leading and trailing spaces from each word before adding it to the set
        }
        System.out.println("Unique words in ascending order: " + set);

    }   
}

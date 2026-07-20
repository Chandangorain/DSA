/*
Input:
 (1,2),(2,1),(3,4),(4,5),(5,4)
Output:
 (2,1) (5,4)
*/


package Arrays;
   import java.util.*;

public class Symmatric {
 
    public static void symmetricPair(int[][] pairs) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < pairs.length; i++) {

            int first = pairs[i][0];
            int second = pairs[i][1];

            if (map.containsKey(second) && map.get(second) == first) {
                System.out.println("(" + first + "," + second + ")");
            } else {
                map.put(first, second);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        // Remove all brackets
        s = s.replace("(", "");
        s = s.replace(")", "");

        // Split each pair
        String[] pairs = s.split(",");

        int[][] arr = new int[pairs.length / 2][2];

        int index = 0;

        for (int i = 0; i < pairs.length; i += 2) {

            arr[index][0] = Integer.parseInt(pairs[i].trim());
            arr[index][1] = Integer.parseInt(pairs[i + 1].trim());

            index++;
        }

        symmetricPair(arr);
    }
}
    


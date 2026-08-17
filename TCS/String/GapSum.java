/*
### Question: Sum of Gaps

You are given a string **S** containing lowercase English letters.
For every pair of **adjacent characters**, calculate the absolute difference (gap) between their values.

Return the **sum of all the gaps**.
**Input : abc
(b - a) = 2 - 1 = 1
(c - b) = 3 - 2 = 1

Sum:
1 + 1 = 2
2
```

*/
package String;

public class GapSum {
    public static int sumGaps(String s) {

    int sum = 0;

    for (int i = 0; i < s.length() - 1; i++) {

        int val1 = s.charAt(i) - 'a' + 1;   // val for current 
        int val2 = s.charAt(i + 1) - 'a' + 1;  // val for next

        int gap = val2 - val1;

        sum += gap;
    }

    return sum;
}
    public static void main(String[] args) {
        String s = "abc";
        int result = sumGaps(s);
        System.out.println(result);
    }
    
}

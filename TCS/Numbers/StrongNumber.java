package Numbers;
    import java.util.*;
public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        ArrayList<Integer> list = new ArrayList<>();
        while (n != 0) {
            int digit = n % 10;
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }
            list.add(fact);
            n /= 10;
        }
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        if (sum == original) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
    


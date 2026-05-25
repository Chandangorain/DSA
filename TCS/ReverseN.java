//reverse the digits of a given integer
//input: 12345
//output: 54321

public class ReverseN {
    public static int reverse(int x){
        int rev=0;
        int digit=0;
        while(x!=0){
            digit=x%10;
            rev=rev*10+digit;
            x=x/10;
    }
    return rev;
    

}
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int ans=reverse(n);
    System.out.println(ans);
}
}


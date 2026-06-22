/*
count sunday 

*/
import java.util.*;
public class CountSunday {

    public static int sundaycount(String startday,int k){
        Map<String,Integer>map=new HashMap<>();
        map.put("sun",0);
        map.put("mon",1);
        map.put("tue",2);
        map.put("wed",3);
        map.put("thu",4);
        map.put("fri",5);
        map.put("sat",6);

        int start=map.get(startday);
        int count=0;
        for(int i=0;i<k;i++){
            int currday=(start+i)%7;
            if(start==0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String startday=sc.nextLine();
        int k=sc.nextInt();
        System.out.println(sundaycount(startday,k));
    }
    
}

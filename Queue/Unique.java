// unique character in a string leetcode 387
package Queue;
import java.util.*;

public class Unique {

    public static int firstUniCharac(String s){
         HashMap<Character,Integer> map=new HashMap<>();
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!map.containsKey(ch)){           // if appears first time
                q.add(i);       // add in queue
            }
            map.put(ch,map.getOrDefault(ch,0)+1); // update the freq

            while(!q.isEmpty() && map.get(s.charAt(q.peek()))>1){ // unless the queue is empty and the freq of char at front of queue is greater than 1 means not unique
                q.remove(); //then remove the front element 
            }

        }
        if(q.isEmpty()){
            return -1;
        }else{
           return  q.peek();
        }
        
    };

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();     //enter the string
         int result =firstUniCharac(s);

         System.out.println(result);            // print the index of first unique character 
         System.out.println(s.charAt(result)); // print the first unique character

    }
    
   
}

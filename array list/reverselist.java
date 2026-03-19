// list =1,2,3,4,5

import java.util.*;

public class reverselist {
    public static void main(String[]args){
     ArrayList<Integer>list=new ArrayList<>();
     list.add(1);
     list.add(2);
     list.add(3);
     list.add(4);
     list.add(5);

     for(int i =list.size()-1;i>=0;i--){  // reverse
        System.out.println(list.get(i)+ " ");
     }




      
    
}
}

import java.util.*;
public class intro {
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();

        list.add(1);  //0(1)
        list.add(2);
        list.add(3);

        list.add(4);

        System.out.println(list);

        //get operation
          int x=list.get(2);
          System.out.println(x);

          ///remove
          list.remove(2);
          System.out.println(list);

          //set element at index
          list.set(2, 10);
          System.out.println(list);

          // contains element  
          System.out.println(list.contains(1));
          System.out.println(list.contains(11));
          
          // size of list 
          System.out.println(list.size());


    }
    
}

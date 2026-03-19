// swaping between idx1 and idx3

import java.util.*;

public class swap {

    public static void swap(ArrayList<Integer>list, int idx1, int idx2){

        int temp=list.get(idx1); // store idx1 value in temp
        list.set(idx1,list.get(idx2)); // swap idx2 value in idx1
        list.set(idx2,temp); // store idx2 value in temp

    }
    public static void main(String[]args){
     ArrayList<Integer>list=new ArrayList<>();  // store the elements
      list.add(1);
     list.add(2);
     list.add(3);
     list.add(4);
     list.add(5);

     int idx1=1; int idx2=3;
     System.out.println(list);
     swap(list,idx1,idx2);
     System.out.println(list);




    }
    
}

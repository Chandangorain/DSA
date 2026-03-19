import java.util.*;
public class Intro{
    public static void main(String[]args){
        //create
        HashMap<String,Integer> hm=new HashMap<>();
        //insert 
        hm.put("India",100);
        hm.put("China",150);
        hm.put("usa",50);

        System.out.println(hm);

        //Get 
        int population=hm.get("India");
        System.out.println(population);

        //containsKey - 0(1)
        System.out.println(hm.containsKey("India"));  //=> True
        System.out.println(hm.containsKey("Nepal"));  //=> False

        //Remove
        System.out.println(hm.remove("China"));
        System.out.println(hm);

        //size
        System.out.println(hm.size()); //=>3

        //IsEmpty : To check if emty or not
        System.out.println(hm.isEmpty()); //=>False

        //Clear
        hm.clear();   



    }
}
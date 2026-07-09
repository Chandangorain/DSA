/*
time conversion
case 1:
input: 07:05:45PM
output: 19:05:45
case 2:
input: 12:00:00AM
output: 00:00:00
case 3:
input: 12:00:00PM
output: 12:00:00


*/



import java.util.*;
public class TimeConverse {
  public static String timeconversion(String s){
    String ampm=s.substring(8);
    int hour=Integer.parseInt(s.substring(0,2));

    if(ampm.equals("AM")){
      if(hour==12){
        hour=0;
      }
    }else{
      if(hour!=12){
        hour+=12;
      }
    }
    String newhour=String.format("%02d",hour);
    return newhour+s.substring(2,8);
    
    
  }
  
public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      System.out.println(timeconversion(s));
}
}
    


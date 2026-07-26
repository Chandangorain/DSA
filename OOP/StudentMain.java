package OOP;
// Encapsulation 

class Student {
    private int roll;       // private to restrict access from outside the class
    private String name;
    private double per;
    
    public void setStudent(int r,String s,double p){        //setstudent is public because we want to access it from outside the class
        roll=r;
        name=s;
        per=p;
    }
    
    public void showStudent() {                     // showStudent is public because we want to access it from outside the class
        System.out.println("roll"+roll);
         System.out.println("name"+name);
          System.out.println("percent"+per);
        
    }
    
}
public class StudentMain {
    public static void main(String[]args){
        
        Student s=new Student();    // creating object of student class
        s.setStudent(100,"amit",75);
        s.showStudent();    // calling showStudent method to display the values of roll, name and percent
        
    }
}
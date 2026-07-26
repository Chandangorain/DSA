package OOP;

 class Car{ 
    private void moveBreakpads(){       // logic of move breakpad .., no need to show to user

    }
    private void changePistonspeed(){

    }
    private void createspark(){

    }
    public void turnoncar(){    // when turnon , call createspark method
        createspark();
    }
    public void acceleratecar(){
        changePistonspeed();
    }
    public void stopcar(){
        moveBreakpads();
    }


    
}

public class AbstractionMain {
    public static void main(String[]args){
        Car c=new Car();    // new object of car class
        c.turnoncar();  // calling turnoncar method to start the car
        c.acceleratecar();
        c.stopcar();
    }
    
}

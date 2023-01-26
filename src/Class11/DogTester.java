package Class11;

import java.util.Scanner;

public class DogTester {
    public static void main(String[] args) {
       // creating an actual object from the class scanner
       // Scanner input=new Scanner (System.in);
        //this is how we create the objects of a class
        // must have class in same package or project
        Dog dog1=new Dog();
        dog1.bark();
        dog1.sleep();
    }

}

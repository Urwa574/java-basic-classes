package class5;

import java.util.Scanner;

public class scannerDemo1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in); //whatever name u want to assign name e.g scan,a,b whatever
        /* scanner = name of the class
        scan is just a variable like create primitive variables.
        system.in_> tells the computer we want to read the data from keyboard.
        system.out is tell the computer to put te data in computer.
         */
        System.out.println("please enter your age");
        int age=input.nextInt();
        System.out.println("you are "+age+" years old");
        System.out.println("What is your gender?");
        char gender=input.next().charAt(0);
        System.out.println(gender);
        System.out.println("enter your weight");
        double weight=input.nextDouble();
        System.out.println("your "+weight+" Kg");
        System.out.println("are you hungry");
        boolean hungry=input.nextBoolean();
        System.out.println("hungry "+hungry);
        System.out.println("please enter your name");
        String fullName=input.next();
        System.out.println("my name is "+fullName);// if you want to enter full name than next line and if you want just ur name then next
        input.close(); // good practice should do this





    }
}

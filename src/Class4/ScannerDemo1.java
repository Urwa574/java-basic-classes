package Class4;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in); // this line helps us to get the input from keyboard
        System.out.println("please enter your name");
        String name=input.nextLine(); //nextLine is used when we have to take sentences from the keyboard
        System.out.println("My name is "+name);

    }
}

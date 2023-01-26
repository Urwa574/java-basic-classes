package Class8;

import java.util.Scanner;

public class LoopWithString {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter your name");
        while (input.next().equals("Sha")){ //(input.next().equalsIgnoreCase("Sha)){ another way
            System.out.println("great student");

        }
    }
}

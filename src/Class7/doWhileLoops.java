package Class7;

import java.util.Scanner;

public class doWhileLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number =0;

        do {
            System.out.println("Please enter a number : ");
            number=scanner.nextInt();
// do while use rear

        }while (number!=5);

        int num1=0;
        while(num1!=5){
            System.out.println("Please Enter a number");
            num1= scanner.nextInt();
        }

    }
}



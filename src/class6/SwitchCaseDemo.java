package class6;

import java.util.Scanner;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter country");
        String country=input.next();

        switch (country.toLowerCase()) { // converts text to lowercase USA=>usa

            case "usa":
                System.out.println("Burgers");
                break;
            case "italy":
                System.out.println("Pasta");
                break;

            case "afghanistan":
                System.out.println("Kebab");
                break;

            default:
                System.out.println("Wrong country");
        }
    }
}

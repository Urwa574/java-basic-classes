package class6;

import java.util.Scanner;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter country");
        String country = input.next();

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
//        System.out.println("Enter the age of the Child");
//        int age=input.nextInt();
//
//        switch (age) {
//
//            case 1:
//                System.out.println("You can Crawl");
//                break;
//            case 2:
//                System.out.println("You can Talk");
//                break;
//
//            case 3:
//                System.out.println("You can Dance");
//                break;
//
//            case 4:
//                System.out.println("You can get Trouble");
//                break;
//
//            default:
//                System.out.println("I don't know how old you are");
//        }
        }
    }
}
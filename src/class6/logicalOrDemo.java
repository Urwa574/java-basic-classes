package class6;

import java.util.Scanner;

public class logicalOrDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter day");
        // ignore case is for case sensitivity ignore upper lower letter
        String day=input.next();
        if(day.equals("Monday")||day.equals("Friday")){
            System.out.println("No Class Today");
        }else if(day.equalsIgnoreCase("Saturday")||day.equalsIgnoreCase("Sunday")){
            System.out.println("Java class Enjoy");
        } else if (day.equalsIgnoreCase("Wednesday")||day.equalsIgnoreCase("Tuesday")) {
            System.out.println("Manual testing class");
        } else if (day.equalsIgnoreCase("Thursday")) {
            System.out.println("Review Class");
        }else {
            System.out.println("Wrong Day entered");
        }
        input.close();
    }
}

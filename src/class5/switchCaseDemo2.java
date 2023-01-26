package class5;
import java.util.Scanner;
public class switchCaseDemo2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your gender");
        char gender=input.next().charAt(0);
        switch (gender){
        case'F':
        System.out.println("Female");
    break;
            case 'M':
                System.out.println("Male");
                break;
            default:
                System.out.println("not specified");}
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter the name of the instructor");
//        String name = scan.nextLine();
//
//        switch  (name.toLowerCase()) {
//
//            case "Asghar":
//                System.out.println("Will take care of Java Assignment");
//                break;
//            case "Moazzam":
//                System.out.println("Will take care of SDLC Assignment");
//                break;
//            case "Weqas":
//                System.out.println("Will take care of Selenium Assignment");
//                break;
//            case "Asel":
//                System.out.println("Will take care of every Assignment");
//                break;
//            default:
//                System.out.println(" Invalid instructor selected");
//        }
    }
}

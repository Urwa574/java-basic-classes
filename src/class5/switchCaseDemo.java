package class5;

public class switchCaseDemo {
    public static void main(String[] args) {
        int day=1;
        switch (day) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("Sunday");

                System.out.println("wrong day");
// here we can not use boolean,long,
                break;
            default:
                System.out.println("wrong day");
// here we can not use boolean,double,float
                break;
                //we can use these data types char,int,byte,short,string.
            //we can not use relational operators in switch case statements
            // also can not use logical op here
        }

    }
}

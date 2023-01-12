package class2;

public class VariableDemo2 {
    public static void main(String[] args) {
        int numberBox = 10;//we don't need to define data type again and again remembers its
        // this is called overwriting we are assigning number 20 to numberBox,
        //so it will overwrite 10 with 20
        numberBox = 20;
        System.out.println(numberBox);
        numberBox = 200;
        System.out.println(numberBox);
        numberBox = 30;
        System.out.println(numberBox + 20);
        int number = 20;

        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        System.out.println("a+b = " + (a + b));
        System.out.println("a-b = " + (a - b));
        System.out.println("b/a = " + (b / a));
        System.out.println("a*b = " + (a * b));
        System.out.println("b%a = " + (b % a));
        System.out.println("c%d = " + (c % d));
// post incrimnt thats y values not change pre only change
        System.out.println("a++ = "+(a++)); //a old value=10 +1=11
        System.out.println("a-- = "+(a--)); //old value now 11  -1 means -1= 10
        //pre incriment
        System.out.println("d++ = "+(d++));// old value is 25
        //pre perform
        System.out.println("++d = "+(++d));// +2 +27

    }
}

package Class14;

import java.util.Scanner;

public class MathTester {
    public static void main(String[] args) {
        Math math=new Math();
        math.add(10,10);
        math.mul(2,4,6);
       // Scanner input=new Scanner(System.in);
        int result=math.sub(100,50);
        System.out.println(result);
    }
}

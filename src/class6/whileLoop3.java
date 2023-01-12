package class6;

import java.util.Scanner;

public class whileLoop3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number=1;
        int sum=0;
        while (number<=10){
            sum=sum+number;
            number++;
        }
        System.out.println(sum);

        //he change 10 to 5
    }
}

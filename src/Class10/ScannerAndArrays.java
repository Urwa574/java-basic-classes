package Class10;
import java.util.Arrays;
import java.util.Scanner;

public class ScannerAndArrays {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter 5 numbers");
        int[] numbers=new int[5];
        //below code manually store numbers in the array
//        numbers[0]=40;
//        numbers[1]=50;
//        numbers[2]=60;
//        numbers[3]=70;
//        numbers[4]=80;
//below code take numbers from user and store them in the array its good but a lot of code
//        numbers[0]=input.nextInt();
//        numbers[1]=input.nextInt();
//        numbers[2]=input.nextInt();
//        numbers[3]=input.nextInt();
//        numbers[4]=input.nextInt();
        // below code is uses a normal for loop to ask the user for numbers and store them in the array best code and short
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=input.nextInt();
         //   numbers[i]=numbers[i]*10;

        }
        System.out.println(Arrays.toString(numbers));
     //   for (int j=0; j<numbers.length; j++){
           // System.out.println(numbers[j]);
        }

    }


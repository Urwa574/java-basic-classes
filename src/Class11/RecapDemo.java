package Class11;
import java.util.Arrays;
public class RecapDemo {
    public static void main(String[] args) {

        int [][] matrix={{10,20,30},
                       {45,55,66},
                        {30,40,20,10,25}
        };
        System.out.println(matrix[2][4]);
        System.out.println(Arrays.toString(matrix[0])); //to print whole 0 column
        for (int i = 0; i < matrix[0].length; i++) {
            System.out.println(matrix[0][1]); //with the help of loop
        }
        int []  arr=matrix[0]; //getting complete first array from 2d array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        for (int i = 0; i < matrix[2].length; i++) {
            System.out.println(matrix[2][i]);
        }
    }
}

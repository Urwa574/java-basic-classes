package Class11;

public class Example2 {
    public static void main(String[] args) {
        int[][] matrix = {{10, 20, 30},
                {45, 55, 66},
                {30, 40, 20, 10, 25}
        };
        for (int i = 0; i < matrix.length; i++) {
            //no of 1d arrays =3
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 != 0) {
                    System.out.println(matrix[i][j]);
                }
            }
            System.out.println();
        } // enhance each loop
        for (int[] arr : matrix) {
            for (int number : arr) {
                if (number % 2 != 0) {
                    System.out.println(number);
                }
            }
        }
        //foreach loop to print all numbers from a 2D array
        for (int[]arr:matrix){
            for (int number:arr){
                System.out.println(number+" ");
            }
        }
    }}

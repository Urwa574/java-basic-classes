package Class11;

public class Example {
    public static void main(String[] args) {
        int[][] matrix = {{10, 20, 30},
                         {45, 55, 66},
                          {30, 40, 20, 10, 25}
     }; //write a loop to print all the elements from this 2d arrays
        //martix.length tells us how 1D arrays are present in this 2D array
        for (int i = 0; i < matrix.length; i++) { //no of 1d arrays =3
            for (int j = 0; j < matrix[i].length; j++) {
                //martix[i].length the size of each 1D array
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();}

            System.out.println("--------------------");


        }
}









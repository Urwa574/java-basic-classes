package Class8;

public class NestedLoops4 {
    public static void main(String[] args) {
        for(int i=1; i<=3;i++){
            for(int a=1; a<=5;a++){
                System.out.print(" "+a);// column
        }
           System.out.println(); //row
    }
        for(int ii=0; ii<3; ii++){
            for (int j=0; j<5; j++){
                if (j==1||j==2){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("****************");






    }
}


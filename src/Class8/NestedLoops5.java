package Class8;

public class NestedLoops5 {
    public static void main(String[] args) {
        for(int i = 0; i < 3; i++) {
            for (int j = i; j <=5; j++) { //i=j only execute once
                System.out.print(j+" ");
            }
            System.out.println();
//        for (int i =0; i<3; i++){
//            if (i==0){
//                for (int j =0; j<=5; j++){
//                    System.out.print(j+" ");
//                }
//            }else if (i==1){ //also pout sout with empty syntax
//                for (int j =1; j<=5; j++){
//                    System.out.print(j+" ");
//                }
//            }else if (i==2){
//                for (int j =2; j<=5; j++){
//                    System.out.print(j+" ");
//                }
//            }
//            System.out.println();
        } //2nd way
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = i; k <= 5 ; k++) {
//                System.out.print(k + " ");
//
//            }
//            System.out.println();
       // } 3rd way
        //for (int i = 0; i<3 ; i++) {
        //            for (int j = i; j <=5 ; j+=1) {
        //
        //                System.out.print(j);
        //            }
        //            System.out.println();
        //final way
            /*  0 1 2 3 4 5
            1 2 3 4 5
            2 3 4 5

         */



    }
}

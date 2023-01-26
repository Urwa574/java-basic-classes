package Class8;

public class BreakKeywordDemo1 {
    public static void main(String[] args) {

        boolean summer=true;
        int temp=75;
        while (summer) {

            if (temp <= 100) {
                System.out.println("I love summer "+temp);
            } else {
                System.out.println("It's very hot "+temp);
//                break;
                summer = false;
            }
            temp += 5;
        }
        System.out.println("_________________________");
        boolean summ=true;
        int tem=75;
        while(summ){
            if(tem<=100){
                System.out.println("i love summer "+tem);
            }else{
                summ=false;
                System.out.println("its hot out side "+tem);
            }
                tem+=5;
        }
        //3rdway
//            int temperature=75;
//             while(temperature>=105){
//            if(tem<=100){
//            System.out.println("i love summer "+temperature);
//        }else {
//                System.out.println("Its very hot "+temp);
//            }
//                 temp+=5;
             }
    }


package Class8;

public class BreakKeywordDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            if(i==3){
                break; //only use in nested loops and switch cases.
            }
            System.out.println(i);
        }


        System.out.println("Last line in our code");
    }
}

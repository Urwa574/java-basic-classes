package Class8;

public class ContinueKeywordDemo1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            if(i%3==0){ //(i==3||i==6||i==9) other way to write with OR
                continue;  // skip
            }else {
                System.out.println(i); // break and continue always come with if condition

            }
            System.out.println("Hello Java");

    }
    }
}

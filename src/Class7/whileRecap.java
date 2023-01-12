package Class7;

public class whileRecap {
    public static void main(String[] args) {
        //in while always condition is true or false with relational operators
        int number=10;
        while (number<20){
            System.out.println(number<20); //iswaja se true arha
            if(number<15){
                System.out.println("number is still less than 15");
            }else {
                System.out.println("Number is greater than 15 now");
            }
            System.out.println(number);
            number++;

        }

    }
}

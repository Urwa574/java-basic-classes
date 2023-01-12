package Class4;

public class NESTIfDemo3 {
    public static void main(String[] args) {
        int money = 1000;
        String day = "Sunday";
        boolean mood = false;
        if (money > 700) {
            if (mood) {
                System.out.println("lets go for shopping");
            } else {
                System.out.println("lets save money first");
            }
        }
    }
}
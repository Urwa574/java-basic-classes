package Class12;

public class StringDemo8 {
    public static void main(String[] args) {
        String str="java is love";
        char c=str.charAt(2);
        System.out.println(c);
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
            System.out.println("*****"); // counting a how many times repeating.
            int sum = 0;
            for (int a = 0; a < str.length(); a++) {
                if (str.charAt(a) == 'a'){
                    sum++;
                }
            }
            System.out.println(sum);
        }

    }
}

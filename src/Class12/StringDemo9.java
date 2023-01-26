package Class12;

public class StringDemo9 {
    public static void main(String[] args) {
       String str="jgdhff 98983 ';]'[];%" ;
       int counter=0;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isAlphabetic(str.charAt(i))){ //isDigit for number isAlphabetic is for alpha //is
                counter++;
            }
        }
        System.out.println("total isAlphabetic in str "+counter);
    }
}

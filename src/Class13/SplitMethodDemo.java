package Class13;

public class SplitMethodDemo {
    public static void main(String[] args) {
        String str="i like java. I write a lot of code daily. Iam from batch 15.";
        String [] strArr=str.split("[.?!]");
        System.out.println(strArr.length);
        System.out.println(strArr[0]);
        System.out.println(strArr[1].trim());
        System.out.println(strArr[2].trim());
    }
}

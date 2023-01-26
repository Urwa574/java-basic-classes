package Class12;

public class StringDemo7 {
    public static void main(String[] args) {
        String str="I love java";
        boolean startsWith=str.startsWith("I");
        System.out.println(startsWith);
        System.out.println(str.endsWith("java"));
        System.out.println(str.toLowerCase().startsWith("i"));
        // method changing is a method is use when we put/use multiple method on a same line or called on the same line.
        //only those methods can be chained which returns a string
        System.out.println(str.contains("java"));
        // contains checks that is work u write in contain method is present or not if present then true otherwise false
    }
}

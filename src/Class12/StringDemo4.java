package Class12;

public class StringDemo4 {
    public static void main(String[] args) {
        String str=" "; //it's a boolean type of method if we put something/or space in it shows the result false
        boolean isEmpty=str.isEmpty();
        System.out.println(isEmpty); // this method widely use
        System.out.println(str.isBlank());
     //   System.out.println(str.isBlank()); another method and did not count any space eg. " " result true/ in empty method
        // if we put " " result false bcz this method count space too
    }
}

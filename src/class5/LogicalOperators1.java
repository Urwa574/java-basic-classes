package class5;

public class LogicalOperators1 {
    public static void main(String[] args) {
        System.out.println(true||true);
        System.out.println(true||false);
        System.out.println(false||false);
        System.out.println(false||true|false|false); //first|| should be double after |single is ok
// if one conditions hV at least one true and other false the result will be true
        // if all false then result will be false
        // if all true result will be true
        // logical operators only works with boolean
      boolean boughtFlowers=false;
      boolean boughtCho=false;
      if(boughtFlowers||boughtCho){
          System.out.println("im happy");
      }else{
          System.out.println("im sad");
      }
    boolean wifi=false;
      boolean fiveG=false;
      if(wifi||fiveG){
        System.out.println("you are good for browsing");
      }else {
          System.out.println("either connect to wifi or to 5G"); // both are false thats y else
      }












    }
}

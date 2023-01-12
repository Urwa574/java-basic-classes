package class5;
public class LogicalOperators {
    public static void main(String[] args) {
        System.out.println(!true);
        //arithmetic helps us perform mathematics op
        // relational op is use compare things
        //logicals are use for if else combine boolean cond
        System.out.println(!false);
        boolean rich = true;
        System.out.println(!rich);
        int number = 9;
        if (number != 1) {
            System.out.println("hello Java");
        } else {
            System.out.println("Hello word");
        }
        String country = "China";
        if (!country.equals("BadCountry")) {
            System.out.println("You are welcome");
        }
        if (country.equals("China")) {
            System.out.println("You are welcome");
        }
        if (country.equals("Nepal")) {
            System.out.println("You are welcome");
        }
        if (country.equals("Pakistan")) {
            System.out.println("You are welcome");
        }
        if(10>5 || 4>6){
            System.out.println("1"); //here we use or if one is true thn true
        }else{
            System.out.println("2");
        }

        String name="Adam";
        int age=30;
        if(name.equals("Adam")&& age==30){
            System.out.println("You are the Adam from batch 13"); // && one is false all false
        }else{
            System.out.println("I don't know you");
        }
        boolean isTrue=false;
        if(!isTrue){
            System.out.println("you got it");
        }else {
            System.out.println("meed more practice");
        }
        boolean cond=false;
        boolean condition=!cond; //!means not simply means false which save in con false
        System.out.println(condition);
        if(condition){
            System.out.println("you got it");
        }else{
            System.out.println("need more practice");
        }
    }
}
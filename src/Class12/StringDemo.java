package Class12;

public class StringDemo {
    public static void main(String[] args) {
        // creating an obj of the string class
        String strObj=new String("Java");
        //another way of creating an obj of string class a shorter way
        //mostly use this is how we create the obj of string class
        String strObj2=new String("Java");
        // another way of creating an object of String class a shorter way
        // mostly this is how we create the objects of String class
        System.out.println(strObj2.length());
        String str="Banana ";
        int len=str.length();
        System.out.println(len);
        String name="Hamid poya ";
        if(name.length()>10){
            System.out.println("Name can't be more than 10 letters");
        }

    }
}

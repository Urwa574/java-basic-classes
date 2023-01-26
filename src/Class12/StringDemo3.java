package Class12;

public class StringDemo3 {
    public static void main(String[] args) {
        // concatenation
        String firstNmae="Akhter";
        String LastNmae="Lava";
        String fullNmae=firstNmae+" "+LastNmae; //most widely used
        System.out.println(fullNmae);
        System.out.println(fullNmae+" "+LastNmae);
        System.out.println(fullNmae.concat(" "+LastNmae));
    }
}

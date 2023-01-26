package Class11;

public class CatTester {
    public static void main(String[] args) {
        // creating an object from the cat class
        Cat cat1= new Cat();
        cat1.name="lego";
        cat1.bread="Van Cat";
        cat1.age=2;
        cat1.attitude=false;
        cat1.cOlor="Grey";
        cat1.eat();
        System.out.println(cat1.name);
        // class with another variable
        Cat cat2= new Cat();
        cat2.name="Domestic";
        cat2.cOlor="White";
        System.out.println(cat2.name);
        cat2.speak(); //behaviour
    }
}

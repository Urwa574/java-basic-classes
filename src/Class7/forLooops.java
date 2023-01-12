package Class7;

public class forLooops {
    public static void main(String[] args) {
       // print num from 0 to 9
        int num=0;
        while (num<10){
            System.out.println(num);
            num++;
        }
       // (initialization ; condition ; increment or decrement);
        for(int a=0 ;a<9; a++){
            System.out.println(a);
        }
        System.out.println("*****************************");
        // using for loop print odd num 1 to 20;
        for (int i=1; i<20; i +=2){
            System.out.println(i);
        }
    }
}

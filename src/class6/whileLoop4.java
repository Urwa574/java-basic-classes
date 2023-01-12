package class6;

public class whileLoop4 {
    public static void main(String[] args) {
        int number=1;
        boolean flag=true;
        while (flag){

            System.out.println(number);
            if(number>3){
                flag=false;
            }
            number++;
            boolean cond=true;
            int numb=0;
            while (cond){
                System.out.println("hi");
                if(numb>3){
                    cond=false;
                }
                numb++;
            }
        }
    }
}

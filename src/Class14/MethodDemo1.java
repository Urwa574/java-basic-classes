package Class14;

public class MethodDemo1 {
    public static void main(String[] args) {
        int [] array1={10,20,30,45,50};
        int sum=0;
        for (int number:array1){
            sum+=number;
        }
        System.out.println(sum); //this is the manual way to add array again and again
        // System.out.println(Arrays.toString(array1));
        int [] array2={10,10,10,20,30};

        int sum2=0;
        for (int number:array2){
            sum2+=number;
        }
        System.out.println(sum2);

        int [] array3={10,10,15,20,30};

        sum2=0;
        for (int number:array3){
            sum2+=number;
        }
        System.out.println(sum2);
    }
}

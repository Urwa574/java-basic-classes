package Class10;

public class ForEachLoopDemo2 {
    public static void main(String[] args) {
        int [] arr={10,13,20,25,45,50};
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]%2!=0){ //array hi use kia ha
                System.out.println(arr[i]);
            }}
            System.out.println("---------");
            //replace all the odd numbers in this array with the help of a normal loop
            for (int i = 0; i < arr.length ; i++) {
                if (arr[i] %2!=0){
                    arr[i]=0;
                    System.out.println(arr[i]);
                }}
                System.out.println("after replace all the odd numbers with zero ");
                for (int i = 0; i < arr.length; i++) {
                    System.out.println(arr[i]);
                }
            int [] numbers={45,78,12,67,55,89,23,77,88};
            for(int i=0;i<numbers.length;i++){
            if(numbers[i]%2==0){

                System.out.print(numbers[i]+" ");
                }


            }
}}



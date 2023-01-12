package Class4;

public class NestedIfDemo4 {
    public static void main(String[] args) {
        boolean studyHard=true; // if we want else portion in result just put false
        int salary=90000;

          if(studyHard){
              System.out.println("We get the job");
              if(salary>100000){
                  System.out.println("Lets buy a Tesla");
              }else{
                  System.out.println("lets buy toyota");
              }
          }else {
              System.out.println("it might take a little longer for us to get the jobs");
          }
    }
}

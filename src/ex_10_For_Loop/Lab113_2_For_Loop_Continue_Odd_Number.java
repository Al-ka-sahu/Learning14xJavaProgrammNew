package ex_10_For_Loop;

public class Lab113_2_For_Loop_Continue_Odd_Number {
    public static void main(String[] args) {
        for (int i =1; i <= 50; i++){
            if (i % 2!= 0) {
                continue; // now, only print ODD value and if condition is false the again loop will be run.
                 }
            System.out.println(i);
        }

    }
}
